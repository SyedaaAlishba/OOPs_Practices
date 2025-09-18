package comparator;

import students.Student;
import java.util.Comparator;

/**
 * A comparator to sort students based on their seat number numerically.
 * Seat numbers are in the format "BXXXXXXXXXXX" (B + digits).
 * This comparator converts the numeric part of the seat number to a long
 * and compares them to ensure proper numeric ordering.
 */
public class SeatNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // Extract the numeric part of the seat number by removing the 'B'
        // Example: "B24110006148" -> "24110006148"
        long num1 = Long.parseLong(s1.getSeatNo().substring(1));
        long num2 = Long.parseLong(s2.getSeatNo().substring(1));

        // Compare the numeric values
        // - Returns negative if num1 < num2 → s1 comes before s2
        // - Returns 0 if num1 == num2 → considered equal in sorting
        // - Returns positive if num1 > num2 → s1 comes after s2
        return Long.compare(num1, num2);
    }

    // This comparator can be easily extended or adapted for sorting by other criteria
    // like NameComparator, GPAComparator, etc.
}