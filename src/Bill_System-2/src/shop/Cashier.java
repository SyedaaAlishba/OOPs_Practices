package shop;

import money.Money;
import people.Customer;
import people.Person;

import java.util.*;

public class Cashier extends Person {
    private HashMap<Integer, Integer> wallet;

    public Cashier(String name) {
        super(name);
        wallet = new HashMap<>();
        for (int n : Money.NOTES) wallet.put(n, 0);
        for (int c : Money.COINS) wallet.put(c, 0);
    }

    public HashMap<Integer, Integer> getWallet() {
        return wallet;
    }

    public void generateBill(Customer customer) {
        int grandTotal = 0;
        for (int i = 0; i < customer.selectedProducts.getSize(); i++) {
            CartItem item = (CartItem) customer.selectedProducts.get(i);
            Product p = item.getProduct();
            System.out.println(item.getPurchasedQuantity() + " - " + p.getName() + " - " + item.getTotalPrice());
            grandTotal += item.getTotalPrice();
        }
        System.out.println("Total: " + grandTotal);
    }

    public int calculateBill(Customer customer) {
        int grandTotal = 0;
        for (int i = 0; i < customer.selectedProducts.getSize(); i++) {
            CartItem item = (CartItem) customer.selectedProducts.get(i);
            grandTotal += item.getTotalPrice();
        }
        return grandTotal;
    }

    private HashMap<Integer, Integer> lastChangeGiven;

    public HashMap<Integer, Integer> getLastChangeGiven() {
        return lastChangeGiven;
    }

    public boolean updateWallet(Customer customer, int paidAmount, HashMap<Integer, Integer> givenNotes) {
        int billAmount = calculateBill(customer);
        int change = paidAmount - billAmount;

        // Add customer’s notes
        for (int denom : givenNotes.keySet()) {
            wallet.put(denom, wallet.getOrDefault(denom, 0) + givenNotes.get(denom));
        }

        if (change == 0) {
            System.out.println("Payment successful! No change required.");
            lastChangeGiven = null;
            return true;
        }

        HashMap<Integer, Integer> changeGiven = giveChange(change);

        if (changeGiven == null) {
            // rollback
            for (int denom : givenNotes.keySet()) {
                wallet.put(denom, wallet.get(denom) - givenNotes.get(denom));
            }
            System.out.println("⚠ Not enough money in proper denominations to return change!");
            lastChangeGiven = null;
            return false;
        }

        System.out.println("Change given successfully: " + changeGiven);
        lastChangeGiven = changeGiven;
        return true;
    }

    //giveChange: tries to return change from cashier wallet
    private HashMap<Integer, Integer> giveChange(int change) {
        HashMap<Integer, Integer> changeMap = new HashMap<>();
        List<Integer> keys = new ArrayList<>(wallet.keySet());
        keys.sort(Collections.reverseOrder());

        int remaining = change;
        for (int denom : keys) {
            int available = wallet.getOrDefault(denom, 0);
            int needed = remaining / denom;
            int use = Math.min(available, needed);

            if (use > 0) {
                wallet.put(denom, available - use);
                changeMap.put(denom, use);
                remaining -= use * denom;
            }
        }

        if (remaining > 0) {
            // rollback if cannot give full change
            for (int d : changeMap.keySet()) {
                wallet.put(d, wallet.getOrDefault(d, 0) + changeMap.get(d));
            }
            return null;
        }

        return changeMap;
    }
}