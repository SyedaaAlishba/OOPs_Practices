package Q1;

public class BankAccount {
   protected   double balance=0;
   protected String accountNumber="";
   public BankAccount(String account_number, double balance ){
       this.accountNumber =account_number;
       this.balance=balance;
   }
    public void deposit(double amount){
        balance+=amount;
         System.out.println("Deposited: "+ amount);
     }
     public void withdraw(double amount){
        balance-=amount;
         System.out.println("WithDrawn : "+ amount);
     }
    public void getBalance() {
        System.out.println("Final balance " + balance);
    }
}
