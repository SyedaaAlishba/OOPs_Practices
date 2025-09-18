package array;

// Class representing a "static array" using a linked list (Node)
public class Array {
    // Head of the linked list (first element of the array)
    private Node head;

    // Current number of elements in the array
    private int size;

    // Maximum number of elements the array can hold (fixed size)
    private int capacity;

    // Constructor to initialize the array with a fixed capacity
    public Array(int capacity) {
        this.capacity = capacity; // Set the maximum allowed size
        this.size = 0;            // Initially, array has 0 elements
        this.head = null;         // No elements yet, so head is null
    }

    // Method to add a new element at the end of the array
    public void add(int value) {
        // Check if array is already full
        if (size >= capacity) {
            System.out.println("Array is full!");
            return; // Stop adding
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
                temp = temp.next; // Move to next node
            }
            // Link the new node at the end
            temp.next = newNode;
        }

        size++; // Increase the current size of the array
    }

    // Method to get the value at a specific index
    public int get(int index) {
        // Check if the index is valid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Traverse the linked list to the desired index
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next; // Move to the next node
        }

        return temp.value; // Return the value at the index
    }

    // Method to display all elements in the array
    public void display() {
        Node temp = head; // Start from the head of the list
        while (temp != null) { // Traverse until the end
            System.out.print(temp.value + " "); // Print each value
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Print a new line after all elements
    }
}

