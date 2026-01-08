package comparator;

import student.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
      String s1Name= s1.getName();
      String s2Name= s2.getName();

      return  s1Name.compareTo(s2Name);
    }
}
