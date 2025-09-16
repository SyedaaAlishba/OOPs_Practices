import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //input 1st number
        System.out.println("Enter First Rational Number  ");
        System.out.println("Enter Numerator");
        int n= sc.nextInt();
        System.out.println("Enter Denominator");
        int d= sc.nextInt();


        //input 2nd number
        System.out.println("Enter Second Rational Number  ");
        System.out.println("Enter Numerator");
        int n2= sc.nextInt();
        System.out.println("Enter Denominator");
        int d2= sc.nextInt();

        try {
            RationalNumber r1 = new RationalNumber(n, d);
            RationalNumber r2 = new RationalNumber(n2, d2);
            RationalNumber sum = Operation.add(r1, r2);
            RationalNumber multi =Operation.multiple(r1,r2);
            RationalNumber div= Operation.division(r1,r2);
            RationalNumber sub= Operation.subtract(r1,r2);
            System.out.println("SUM"+ sum);
            System.out.println("Sub"+sub);
            System.out.println("Multiplication "+multi);
            System.out.println("Division "+div);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
