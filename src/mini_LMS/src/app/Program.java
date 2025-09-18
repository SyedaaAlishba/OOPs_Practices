package app;

import courses.Course;
import courses.CourseList;
import semester.Semester;
import students.Student;
import students.StudentsList;

import java.util.Scanner;

public class Program {

    public  static void run(){

        Scanner sc= new Scanner(System.in);

        Course OOPs= new Course("Object Oriented Programming","CS352");
        Course PF= new Course("Programming Fundamentals","CS351");
        Course ICT= new Course("Introduction to Information and  Communication Technology ","CS353");
        Course ISL= new Course("Islamic Learning ","CS311");
        Course Cal= new Course("Calculus and Analytical Geometry","CS355");
        Course Phy= new Course("Applied Physics ","CS357");
        Course DlD= new Course("Digital Logic Design ","CS354");
        Course LinearAlgebra= new Course("Linear Algebra","CS356");
        Course DS= new Course("Discrete Structures","CS358");
        Course Eng= new Course("Communication and Presentation Skills","CS360");
        Course ICP= new Course("Ideology and Constitution of Pakistan ","CS362");


        // Add all courses to a CourseList
        CourseList courseList2= new CourseList(6);
        courseList2.addCourse(OOPs);
        courseList2.addCourse(DlD);
        courseList2.addCourse(LinearAlgebra);
        courseList2.addCourse(DS);
        courseList2.addCourse(Eng);
        courseList2.addCourse(ICP);

        CourseList courseList1= new CourseList(6);
        courseList1.addCourse(PF);
        courseList1.addCourse(ICT);
        courseList1.addCourse(ISL);
        courseList1.addCourse(Cal);
        courseList1.addCourse(Phy);
        courseList1.addCourse(Eng);

        // Create a semester directly with the whole CourseList
        Semester semester1= new Semester(1,courseList1);
        Semester semester2= new Semester(2,courseList2);

        //students
        Student Alishba = new Student("Syeda Alishba", "B24110006148",semester2);
        Student Sana= new Student("Sana","B2411000666",semester1);
        Student Fajar= new Student("Fajar","B2411000646",semester1);
        Student Ali= new Student("Ali","B2411000656",semester2);

        //add all students in a list
        StudentsList studentsList= new StudentsList();
        studentsList.addStudents(Alishba);
        studentsList.addStudents(Sana);
        studentsList.addStudents(Fajar);
        studentsList.addStudents(Ali);

        System.out.println("Mini LMS");

        int choice= -1;
        while (choice!=0){

            // Print menu every iteration
            System.out.println("------Application------");
            System.out.println("1- Show All Courses of semester 1");
            System.out.println("2- Show All Courses of semester 2");
            System.out.println("3- Show Student Info");
            System.out.println("4- Search Student with Name");
            System.out.println("5- Search Student with SeatNo");
            System.out.println("6- Enroll Student in Another Course");
            System.out.println("7- Drop  Course");
            System.out.println("8- Sort Student with SeatNo");
            System.out.println("9- Sort Student with Name");
            System.out.println("10- Remove Student" );
            System.out.println("0- Exit");

            System.out.println("Enter your choice: ");
            choice= sc.nextInt();
            sc.nextLine(); // consume leftover newline
            switch (choice){
                case 1:
                    System.out.println(courseList1);
                    break;
                case 2:
                    System.out.println(courseList2);
                    break;
                case 3:
                    System.out.println(studentsList);
                    break;
                case 4:
                    sc.nextLine(); // consume leftover newline
                    System.out.println("Enter Student Name:");
                    String name= sc.nextLine();
                    System.out.println(studentsList.searchByName(name));
                    break;
                case 5:
                    System.out.println("Enter Student Seat No:");
                    String seatNo= sc.nextLine();
                    System.out.println(studentsList.searchBySeatNo(seatNo));
                    break;
                case 6:

                    System.out.println("Enter Student Name:");
                    String st_name = sc.nextLine();

                    System.out.println("Enter Student Seat No:");
                    String st_seat = sc.nextLine();

                    // Find the student from StudentsList
                    Student student = studentsList.searchByName(st_name);
                    if (student == null || !student.getSeatNo().equals(st_seat)) {
                        System.out.println("Student not found!");
                        break;
                    }

                    System.out.println("Enter Semester Number:");
                    int sem = sc.nextInt();
                    sc.nextLine(); // consume leftover newline

                    System.out.println("Enter Course Name:");
                    String courseName = sc.nextLine();

                    System.out.println("Enter Course Code:");
                    String code = sc.nextLine();

                    Course course = new Course(courseName, code);

                    if (student.enrollCourse(course, sem)) {
                        System.out.println("Course enrolled successfully!");
                    } else {
                        System.out.println("Failed to enroll course. Semester may be full.");
                    }
                    break;
                case 7: // Drop Course

                    System.out.println("Enter Student Name:");
                    String dropName = sc.nextLine();

                    System.out.println("Enter Student Seat No:");
                    String dropSeat = sc.nextLine();

                    // Find the student
                    Student dropStudent = studentsList.searchByName(dropName);
                    if (dropStudent == null || !dropStudent.getSeatNo().equals(dropSeat)) {
                        System.out.println("Student not found!");
                        break;
                    }

                    System.out.println("Enter Semester Number:");
                    int dropSem = sc.nextInt();
                    sc.nextLine(); // consume leftover newline

                    System.out.println("Enter Course Code to Drop:");
                    String dropCode = sc.nextLine();

                    if (dropStudent.dropCourse(dropCode, dropSem)) {
                        System.out.println("Course dropped successfully!");
                    } else {
                        System.out.println("Failed to drop course. Check semester or course code.");
                    }
                    break;
                case 8:
                    System.out.println("----------Sort with SeatNo----------");
                    studentsList.sortBySeatNo();
                    System.out.println(studentsList);
                    break;

                case 9:
                    System.out.println("----------Sort with Name----------");
                    studentsList.sortByName();
                    System.out.println(studentsList);
                   break;
                case 10:

                System.out.println("Enter Seat No of Student to Remove:");
                String seat = sc.nextLine();

                // Find the student by seat number
                Student studentToRemove = studentsList.searchBySeatNo(seat);
                if (studentToRemove == null) {
                    System.out.println("Student not found!");
                    break;
                }

                // Remove the student
                if (studentsList.removeStudents(studentToRemove)) {
                    System.out.println("Student removed successfully!");
                } else {
                    System.out.println("Failed to remove student.");
                }
                break;
                case 0:
                    System.out.println("Exciting Application....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("choose from the menu");
            }
        }

    }

}
