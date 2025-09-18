package students;

import comparator.SeatNoComparator;

import java.util.ArrayList;

public class StudentsList {
  ArrayList<Student> students;

  public StudentsList(){
      this.students= new ArrayList<>();
  }

  public void addStudents(Student student){
      students.add(student);
  }

  public boolean removeStudents(Student student){
        students.remove(student);
        return true;
  }

  public ArrayList<Student> getStudents() {
        return students;
  }

  public Student getStudentAt(int i){
      return students.get(i);
  }

  public Student searchByName(String name){
      for (int i = 0; i < students.size(); i++) {
         String std_name= students.get(i).getName();
         if(std_name.equalsIgnoreCase(name)){
             return students.get(i);
         }
      }
      return null;
  }

    public Student searchBySeatNo(String SeatNo){
        for (int i = 0; i < students.size(); i++) {
            String std_no= students.get(i).getSeatNo();
            if(std_no.equals(SeatNo)){
                return students.get(i);
            }
        }
        return null;
    }
    //we can do sorting using comparable or comparator also but this is manual approach called Bubble Sort
    public boolean sortByName() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getName().compareTo(students.get(j+1).getName()) > 0) {

                    // swap
                    Student temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }
        }
        return true;
    }

    public boolean sortBySeatNo() {
        // Sort the students list using the SeatNoComparator
        students.sort(new SeatNoComparator());
        return true;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Students List =====\n");
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
