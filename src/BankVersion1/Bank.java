package BankVersion1;

public class Bank {
    private static final int MAX_ACCOUNTS = 1000;
    private final double[] accounts = new double[MAX_ACCOUNTS];
    private final boolean[] active = new boolean[MAX_ACCOUNTS];
    private final boolean[] loan = new boolean[MAX_ACCOUNTS];
    private double rate = 0.14;
    private int nextacct = 0;

    public int newAccount() {
        if (nextacct >= MAX_ACCOUNTS) {
            return -1; // No more accounts can be created
        }
        active[nextacct] = true;
        accounts[nextacct] = 0;
        loan[nextacct] = false;
        return nextacct++;
    }

    public boolean accountExists(int acctnum) {
        return acctnum >= 0 && acctnum < MAX_ACCOUNTS && active[acctnum];
    }

    public double getBalance(int acctnum) {
        return accounts[acctnum];
    }

    public void deposit(int acctnum, double amount) {
        accounts[acctnum] += amount;
    }

    public boolean withdraw(int acctnum, double amount) {
        if (amount > accounts[acctnum]) {
            return false;
        }
        accounts[acctnum] -= amount;
        return true;
    }

    public boolean authorizeLoan(int acctnum, double loanAmount) {
        if (accounts[acctnum] >= loanAmount / 2) {
            loan[acctnum] = true;
            return true;
        }
        return false;
    }

    public String showAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("The bank has ").append(nextacct).append(" accounts.");
        for (int i = 0; i < nextacct; i++) {
            if (active[i]) {
                sb.append("\nAccount ").append(i)
                        .append(": balance = ").append(accounts[i])
                        .append(", Loan taken: ").append(loan[i] ? "Yes" : "No");
            }
        }
        return sb.toString();
    }

    public void addInterest(int acctnum) {
        double interestAmount = accounts[acctnum] * rate;
        accounts[acctnum] += interestAmount;
    }
}

