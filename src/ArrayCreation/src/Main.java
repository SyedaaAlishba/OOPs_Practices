import  array.*;

public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(5);

        Array.add(10);
        Array.add(20);
        Array.add(30);

        Array.display(); // 10 20 30

        System.out.println("Element at index 1: " + myArray.get(1)); // 20
    }
}
