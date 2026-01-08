package student;
import comparator.NameComparator;
import comparator.SeatNoComparator;
import list.customArray;


public class StudentList {
   customArray students;

    public StudentList(){
        this.students= new customArray();
    }

    //copy constructor --> shallow copy
    public  StudentList(StudentList other){
        this.students= other.students;
    }

    public int getCapacity() {
        return students.getCapacity();
    }

    public void addStudents(Student student){
        for (int i= 0; i<students.getSize();i++) {
            Student existing = (Student) students.get(i);
            if (student.getSeatNo().equals(existing.getSeatNo())) {
                System.out.println("Student already exists");
                return;
            }
        }
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void removeStudents(Student student){
        students.delete(student);
        System.out.println("Deleted Successfully");
    }

    public Object getStudents() {
        return  students;
    }

    public Student getStudentAt(int i){
        if(students.isExist(i)){
            return (Student) students.get(i);
        }
        throw new IndexOutOfBoundsException("Student not Found at index"+i);
    }

    public Student searchByName(String name){
        for (int i = 0; i < students.getSize(); i++) {
            String std_name= ((Student) students.get(i)).getName();
            if(std_name.equalsIgnoreCase(name)){
                return  (Student) students.get(i);
            }
        }
        System.out.println("Not Found");
        return null;
    }

    public Student searchBySeatNo(String SeatNo){
        for (int i = 0; i < students.getSize(); i++) {
            String std_no= ((Student)students.get(i)).getSeatNo();
            if(std_no.equals(SeatNo)){
                return (Student) students.get(i);
            }
        }
        System.out.println("Not Found");
        return null;
    }

    public void  replaceStudent(int index, Student student){

        if (!students.isExist(index)) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Prevent duplicate seatNo in the list
        for (int i = 0; i < students.getSize(); i++) {
            if (i == index) continue; // skip the one we're replacing
            Student existing = (Student) students.get(i);
            if (existing.getSeatNo().equals(student.getSeatNo())) {
                System.out.println("Student with seatNo " + student.getSeatNo() + " already exists!");
                return;
            }
        }

        Student studentAtIndex = (Student) students.get(index);
        String s = studentAtIndex.getSeatNo();
        String newStudent = student.getSeatNo();

        if (s.equals(newStudent)) {
            System.out.println("Same Students Cant be replaced");
        }else {
            students.set(index, student);
            System.out.println("Replaced student at index " + index + " successfully");
        }

    }
    public void addStudents(int index , Student student){
        students.add(index , student);
    }

    public void sortBySeatNo() {
        SeatNoComparator comparator= new SeatNoComparator();
        for (int i = 0; i < students.getSize()-1; i++) {
            for (int j = i+1; j <students.getSize() ; j++) {
                Student s1No= (Student) students.get(i);
                Student s2No= (Student) students.get(j);
                if(comparator.compare(s1No,s2No)>0){
                    students.set(i,s2No);
                    students.set(j,s1No);
                }
            }
        }
    }

    public void sortByName(){
        NameComparator comparator = new NameComparator();

        for (int i = 0; i < students.getSize()-1; i++) {
            for (int j = i+1; j < students.getSize() ; j++) {
                Student s1= (Student) students.get(i);
                Student s2= (Student) students.get(j);
                if(comparator.compare(s1,s2)>0){
                    // swap elements at i and j
                    students.set(i, s2);
                    students.set(j, s1);
                }

            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student List:\n");

        for (int i = 0; i < students.getSize(); i++) {
            Student s = (Student) students.get(i);
            sb.append(i + 1).append(". ").append(s).append("\n");
        }

        return sb.toString();
    }



}
