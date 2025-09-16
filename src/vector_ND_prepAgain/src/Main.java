import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Vector v1= new Vector();
        v1.addCords(2.0);
        v1.addCords(9.0);
        v1.addCords(12.0);
        v1.addCords(18.0);
        v1.addCords(24.0);

        //iterator
        for (double i :v1 ) {
            System.out.println(v1);
        }
        Vector v2= new Vector();
        v2.addCords(4.0);
        v2.addCords(2.0);
        v2.addCords(6.0);
        v2.addCords(10.0);

        //comparing with equals()
        boolean flag= v1.equals(v2);
        System.out.println("Are v1 and v2 equal? " + flag);
        //clone
        Vector v3 =v2.clone();
        System.out.println(v3);
        //add two vectors
        try {
            Vector v4 = v3.add(v1);
            System.out.println("Sum: " + v4);
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot add vectors: " + e.getMessage());
        }


    }
}