package arrayList_Creation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // how many numbers user wants to enter
        int capacity = 5;
        int[] arr = new int[capacity];

        for (int i = 0; i < n; i++) {
            // check BEFORE inserting if array is full
            if (i == capacity) {
                int newCapacity = (capacity * 3 / 2) + 1;
                int[] new_arr = new int[newCapacity];

                // copy old elements
                for (int j = 0; j < capacity; j++) {
                    new_arr[j] = arr[j];
                }

                arr = new_arr;       // now arr points to bigger array
                capacity = newCapacity;
            }

            // safe to insert
            arr[i] = sc.nextInt();
        }

        // print results
        System.out.println("Stored elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
