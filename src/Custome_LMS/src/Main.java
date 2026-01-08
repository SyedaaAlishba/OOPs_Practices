import courses.Course;
import courses.CourseList;
import semester.Semester;
import student.Student;
import student.StudentList;

public class Main {
    public static void  main(String []args){

        Course c1= new Course("OOPS","CS-232");
        Course c2= new Course("DS",  "CS-230");
        Course c3= new Course("ICT", "CS-202");
        Course c5= new Course("OOPS","CS-232");

        CourseList courseList= new CourseList(6);
        courseList.addCourse(c1);
        courseList.addCourse(c2);
        courseList.addCourse(c3);
        System.out.println(courseList);
        courseList.removeCourse(c5);
        System.out.println(courseList);

        Semester s1= new Semester(1,courseList);
        System.out.println(s1);
        s1.removeCourse("CS-202");
        System.out.println(s1);

        Student Alishba= new Student("Alishba","B24110006148",s1);
        Student Zarlish= new Student("Zarlish","B24110006140",s1);
        Student Ali= new Student("Ali","B24110006149",s1);
        Student Fara= new Student("Fara","B24110006158",s1);
        Student Bilal= new Student("Bilal","B24110006178",s1);

        StudentList studentList= new StudentList();
        studentList.addStudents(Ali);
        studentList.addStudents(Zarlish);
        studentList.addStudents(Alishba);
        studentList.addStudents(Fara);
        studentList.addStudents(Bilal);
        System.out.println("----------- -------");
        System.out.println(studentList.getCapacity());
        //before sorting
        System.out.println(studentList);

        System.out.println("sorted by name");
        studentList.sortByName();
        System.out.println(studentList);

        System.out.println("sorted by seatNO");
        studentList.sortBySeatNo();
        System.out.println(studentList);

        System.out.println("Search by name");
        System.out.println(studentList.searchByName("Ali"));
        System.out.println("Remove Student");
        studentList.removeStudents(Ali);
        System.out.println("Search by SeatNo");
        System.out.println(studentList.searchBySeatNo("B24110006148"));
        studentList.replaceStudent(1,Bilal); //will not be added
        studentList.addStudents(0,Ali);
        System.out.println(studentList);

    }
}
