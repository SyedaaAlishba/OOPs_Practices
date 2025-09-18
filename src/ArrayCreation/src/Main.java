import  array.*;

public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(5);

        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(50);
        myArray.add(90);


        myArray.display();
        System.out.println("Element at index 1: " + myArray.get(1)); // 20
    }
}
