//Q1--Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
//if the account balance falls below one hundred.

//Q2--Write a Java program that creates a class hierarchy for employees of a company.
// The base class should be Employee, with subclasses Manager, Developer, and Programmer.
// Each subclass should have properties such as name, address, salary, and job title.
// Implement methods for calculating bonuses, generating performance reports, and managing projects.


import Q1.BankAccount;
import Q1.SavingsAccount;
import Q2.Developer;
import Q2.Manager;
import Q2.Programmer;

public class Main {
    public static void main(String[] args) {
        //Ans-->1
        BankAccount my_account= new BankAccount("B1234",600);
        my_account.deposit(1222);
        my_account.withdraw(800);
        my_account.getBalance();
        SavingsAccount myBank = new SavingsAccount("S132",0);
        myBank.deposit(1099);
        myBank.withdraw(20000);
        myBank.getBalance();

        System.out.println();
        System.out.println();
        System.out.println();

        //Ans--2

        Manager manager=new Manager("Alexa","California 123 street",200000,"Senior Manager");
        manager.generating_performance_reports();
        manager.calculating_Bonus();
        manager.managing_projects();

        Developer developer=new Developer("lisa","Australia 234 street",10000,"Senior developer","java");
        System.out.println("-------Developer------");
        System.out.println("Bonus "+developer.calculating_Bonus());
        System.out.println(developer.managing_projects());
        System.out.println(developer.generating_performance_reports());
        developer.writeCode();
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming language "+ developer.getProgramming_lang());

        Programmer programmer=new Programmer("Sara","London 431 street",5000000,"AI dev","python");
        System.out.println("------Programmer------");
        System.out.println("Bonus "+programmer.calculating_Bonus());
        System.out.println ("Language "+programmer.getProgramming_lang());
        System.out.println(programmer.generating_performance_reports());
        programmer.debug();
        programmer.writeCode();
        System.out.println ("Address:" +programmer.getAddress());
    }
}