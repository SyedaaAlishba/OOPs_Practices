package BankVersion1;

import java.util.Scanner;

public class BankClient {
    private Scanner scanner = new Scanner(System.in);
    private Bank bank = new Bank();
    private int current = -1;
    private boolean done = false;

    public void run() {
        while (!done) {
            System.out.print("\nEnter command (new, select, deposit, withdraw, balance, authorizeloan, showall, addinterest, quit): ");
            String command = scanner.next().toLowerCase();
            processCommand(command);
        }
    }

    private void processCommand(String cmd) {
        switch (cmd.toLowerCase()) {
            case "new":
                current = bank.newAccount();
                if (current == -1) {
                    System.out.println("Cannot create more accounts.");
                } else {
                    System.out.println("Your new account number is " + current);
                }
                break;
            case "select":
                System.out.print("Enter account#: ");
                current = scanner.nextInt();
                if (!bank.accountExists(current)) {
                    System.out.println("Account not found!");
                    current = -1;
                } else {
                    System.out.println("The balance of account " + current + " is " + bank.getBalance(current));
                }
                break;
            case "deposit":
                if (checkAccountSelected()) {
                    System.out.print("Enter deposit amount: ");
                    double amt = scanner.nextDouble();
                    bank.deposit(current, amt);
                }
                break;
            case "withdraw":
                if (checkAccountSelected()) {
                    System.out.print("Enter withdrawal amount: ");
                    double amt = scanner.nextDouble();
                    if (bank.withdraw(current, amt)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                }
                break;
            case "balance":
                if (checkAccountSelected()) {
                    System.out.println("Account balance: " + bank.getBalance(current));
                }
                break;
            case "authorizeloan":
                if (checkAccountSelected()) {
                    System.out.print("Enter loan amount: ");
                    double loanamt = scanner.nextDouble();
                    if (bank.authorizeLoan(current, loanamt))
                        System.out.println("Loan approved");
                    else
                        System.out.println("Loan denied");
                }
                break;
            case "showall":
                System.out.println(bank.showAll());
                break;
            case "addinterest":
                if (checkAccountSelected()) {
                    bank.addInterest(current);
                    System.out.println("Interest added. New balance: " + bank.getBalance(current));
                }
                break;
            case "quit":
                done = true;
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Unknown command.");
        }
    }

    private boolean checkAccountSelected() {
        if (current == -1 || !bank.accountExists(current)) {
            System.out.println("No account selected or account does not exist!");
            return false;
        }
        return true;
    }
}
