package comparator;

import student.Student;

import java.util.Comparator;

public class SeatNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
       String s1SeatNO= o1.getSeatNo();
       String s2SeatNO= o2.getSeatNo();
       return s1SeatNO.compareTo(s2SeatNO);
    }
}
