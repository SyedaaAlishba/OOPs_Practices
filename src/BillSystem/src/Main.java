import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total amount");
        int bill = sc.nextInt();
        System.out.println("Enter Given amount");
        int givenAmount = sc.nextInt();
        int returnAmount= givenAmount-bill;

        if (returnAmount < 0) {
            System.out.println("Insufficient amount given!");
            return;
        } else if (returnAmount == 0) {
            System.out.println("Exact amount given. No change to return.");
            return;
        }

        int[] notes= {1000,500,100,50,10};
        int[] coins={5,2,1};
        int count=0;
        // Notes
        for (int i = 0; i < notes.length; i++) {
            int numNotes = returnAmount / notes[i];
            if (numNotes > 0) {
                System.out.println(numNotes + " x Rs. " + notes[i] + " note");
                returnAmount = returnAmount % notes[i]; // update remainder
            }
        }

        // Coins
        for (int i = 0; i < coins.length; i++) {
            int numCoins = returnAmount / coins[i];
            if (numCoins > 0) {
                System.out.println(numCoins + " x Rs. " + coins[i] + " coin");
                returnAmount = returnAmount % coins[i]; // update remainder
            }
        }


    }
}
