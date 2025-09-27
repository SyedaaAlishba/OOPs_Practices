package people;

import customArray.intArray;
import customArray.objectArray;
import shop.CartItem;
import shop.Cashier;
import shop.Product;

import java.util.*;

public class Customer extends Person {
    HashMap<Integer, Integer> wallet;
    public objectArray selectedProducts = new objectArray();

    public Customer(String name) {
        super(name);
        wallet = new HashMap<>();
    }

    public HashMap<Integer, Integer> getWallet() {
        return wallet;
    }


    // Customer can see wallet (sorted high → low)
    public void myWallet() {
        List<Integer> keys = new ArrayList<>(wallet.keySet());
        keys.sort(Collections.reverseOrder());

        for (int denom : keys) {
            int count = wallet.get(denom);
            if (count > 0) {
                System.out.println(denom + " x " + count);
            }
        }
        System.out.println("Your total amount is " + viewTotalMoney());
    }

    public int viewTotalMoney() {
        int total = 0;
        for (int denom : wallet.keySet()) {
            total += denom * wallet.get(denom);
        }
        return total;
    }

    public static void viewProduct() {
        for (int i = 0; i < Product.allProducts.getSize(); i++) {
            Product p = (Product) Product.allProducts.get(i);
            System.out.printf("%-3d- %-20s  %5d%n", i + 1, p.getName(), p.getPrice());
        }
    }

    public void buyProduct() {
        Scanner sc = new Scanner(System.in);
        viewProduct();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Select Product");
            choice = sc.nextInt();

            if (choice == 0) {
                return;
            }
            Product selected = (Product) Product.allProducts.get(choice - 1);

            System.out.println("Enter Quantity");
            int quantity = sc.nextInt();

            CartItem item = new CartItem(selected, quantity);
            selectedProducts.add(item);

            System.out.println("Enter 0 to say Uncle total?");
        }
    }

    public void viewBill(Cashier uncle) {
        uncle.generateBill(this);
    }


  public void payBill(Cashier uncle) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to pay");
    int paisyDiye = sc.nextInt();

    int myMoney = viewTotalMoney();
    int billAmount = uncle.calculateBill(this);

    if (paisyDiye > myMoney) {
        System.out.println("Paisy nahi hain Gareeb");
        return;
    }

    if (paisyDiye < billAmount) {
        System.out.println("Kam paisay diye! Total bill: " + billAmount);
        return;
    }

    // Deduct from customer wallet
    HashMap<Integer, Integer> givenNotes = deductFromWallet(paisyDiye);

    if (givenNotes == null) {
        System.out.println("⚠ Customer wallet didn’t have proper denominations!");
        return;
    }

    // Ask cashier to process payment
    boolean success = uncle.updateWallet(this, paisyDiye, givenNotes);

    if (success) {
        // ✅ Add cashier’s change back to customer wallet
        int change = paisyDiye - billAmount;
        if (change > 0) {
            HashMap<Integer, Integer> changeMap = uncle.getLastChangeGiven();
            if (changeMap != null) {
                for (int denom : changeMap.keySet()) {
                    wallet.put(denom, wallet.getOrDefault(denom, 0) + changeMap.get(denom));
                }
            }
        }

        System.out.println("Customer Wallet (updated):");
        myWallet();
    }
  }


    public HashMap<Integer, Integer> deductFromWallet(int amount) {
        intArray keys = sortKeysDescending();
        int remaining = amount;
        HashMap<Integer, Integer> given = new HashMap<>();

        // 1. Try exact payment
        for (int i = 0; i < keys.getSize(); i++) {
            int denom = keys.get(i);
            int available = wallet.getOrDefault(denom, 0);
            int needed = remaining / denom;
            int use = Math.min(available, needed);

            if (use > 0) {
                wallet.put(denom, available - use);
                given.put(denom, use);
                remaining -= use * denom;
            }
        }

        // 2. If exact not possible, try giving next larger note
        if (remaining > 0) {
            for (int i = 0; i < keys.getSize(); i++) {
                int denom = keys.get(i);
                int available = wallet.getOrDefault(denom, 0);

                if (available > 0 && denom >= remaining) {
                    wallet.put(denom, available - 1);
                    given.put(denom, given.getOrDefault(denom, 0) + 1);
                    remaining -= denom;  // remaining may go negative (overpayment)
                    break;
                }
            }
        }

        // 3. If still not possible → rollback and fail
        if (remaining > 0) {
            for (int d : given.keySet()) {
                wallet.put(d, wallet.getOrDefault(d, 0) + given.get(d));
            }
            return null;
        }

        return given;
    }


    intArray sortKeysDescending() {
        intArray keys = new intArray();
        for (int denom : wallet.keySet()) {
            keys.add(denom);
        }

        for (int i = 0; i < keys.getSize() - 1; i++) {
            for (int j = i + 1; j < keys.getSize(); j++) {
                if (keys.get(i) < keys.get(j)) {
                    int temp = keys.get(i);
                    keys.set(i, keys.get(j));
                    keys.set(j, temp);
                }
            }
        }
        return keys;
    }
}
