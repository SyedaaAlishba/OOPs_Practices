package array;

// Class representing a "static array" element
public class Node {
    int value;

    // Reference to the next node in the list
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null; // Initially, next is null (no next node yet)
    }
}

