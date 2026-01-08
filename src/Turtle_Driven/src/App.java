import java.util.Scanner;

public class App {

    Turtle t = new Turtle();


    public  void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose pattern: 1 = Square, 2 = ZigZag , 3)customize ");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1){
Square_Command cmd = new Square_Command();
cmd.execute();
        }
        else if (choice == 2) {
            ZigZag_Command cmd = new ZigZag_Command();
            cmd.execute();
        } else if (choice == 3) {
            Custom_Design cmd = new Custom_Design();
            System.out.println("enter the command");
            String c = sc.nextLine();
            cmd.execute(c);

        } else{
            System.out.println("invalid Command");
        }
    }
}
