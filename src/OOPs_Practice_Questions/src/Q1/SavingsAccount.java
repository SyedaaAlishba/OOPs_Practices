package Q1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber , double balance){
        super(accountNumber,balance);
    }
    @Override
    public void withdraw(double amount) {
        if(balance-amount>=100){
            balance-=amount;
            System.out.println("WithDrawn "+amount);
        }else {
            System.out.println("Withdrawal denied. Balance cannot fall below 100 or higher than balance.");
        }
    }

}
