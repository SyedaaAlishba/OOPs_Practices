import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        System.out.println("Dice Game");

        Random random= new Random();
        int n= random.nextInt(6)+1;
        System.out.println("You got "+ n);

        System.out.println("2D rolls");
        int n2= random.nextInt();
        Double n3= random.nextDouble(3);
        System.out.println(n2);
        System.out.println(n3);

    }
}
