package array;

// Class representing the "Static Array" using linked nodes
public class Array {

    // Head of the linked list (first element)
    private static Node head;

    // Current number of elements in the array
    private static int size;

    // Maximum number of elements the array can hold
    private static int capacity;

    // Constructor to initialize the array with a fixed capacity
    public Array(int capacity) {
        this.capacity = capacity; // Set maximum size
        this.size = 0;            // Initially, array is empty
        this.head = null;         // No elements yet
    }

    // Method to add an element at the end of the array
    public static void add(int value) {
        // Check if array is full
        if (size >= capacity) {
            System.out.println("Array is full!");
            return;
        }

        // Create a new node to store the value
        Node newNode = new Node(value);

        // If the array is empty, new node becomes the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the last node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Link the new node at the end
            temp.next = newNode;
        }
        size++; // Increment the size
    }

    // Method to get element at a specific index
    public int get(int index) {
        // Check if index is valid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Traverse the list to the desired index
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        // Return the value at that index
        return temp.value;
    }

    // Method to display all elements in the array
    public static void display() {
        Node temp = head; // Start from head
        while (temp != null) { // Traverse until the end
            System.out.print(temp.value + " "); // Print each value
            temp = temp.next; // Move to next node
        }
        System.out.println(); // New line after printing all elements
    }
}
