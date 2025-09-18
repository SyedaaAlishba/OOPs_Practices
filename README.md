# Mini LMS (Learning Management System)

## Overview
This is a **Mini Learning Management System (LMS)** implemented in **Java** using Object-Oriented Programming (OOP) principles.  
The system allows managing **students, courses, and semesters**, providing functionalities such as enrollment, dropping courses, searching students, and sorting. It simulates a simplified version of a university-level LMS.

---

## Features
- **Course Management**
  - Add and remove courses
  - Search courses by name or code

- **Semester Management**
  - Assign courses to semesters
  - View all courses of a semester

- **Student Management**
  - Add and remove students
  - Search students by name or seat number
  - Enroll students in courses
  - Drop courses from students’ semesters
  - Sort students by name or seat number

- **Custom Sorting**
  - Students can be sorted by **name** or **seat number** using a custom comparator

- **Interactive Console Menu**
  - Easy-to-use text-based interface for navigating LMS functionalities

---

## Project Structure
app/<br>
├─ Program.java # Main program logic and interactive menu<br>
└─ Main.java # Main entry point<br>
<br>
courses/<br>
├─ Course.java # Represents a single course<br>
└─ CourseList.java # Manages a list of courses<br>
<br>
semester/<br>
└─ Semester.java # Represents a semester containing multiple courses<br>
<br>
students/<br>
├─ Student.java # Represents a student with multiple semesters<br>
└─ StudentsList.java # Manages a list of students<br>
<br>
comparator/<br>
└─ SeatNoComparator.java # Comparator to sort students by seat number
<br>

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### How to Run
1. Clone or download the repository.
2. Compile all `.java` files.
3. Run `Main.java`.
4. Interact with the LMS through the **console menu**.

---

## Menu Options
1. Show all courses of semester 1  
2. Show all courses of semester 2  
3. Show student information  
4. Search student by name  
5. Search student by seat number  
6. Enroll a student in a course  
7. Drop a course from a student  
8. Sort students by seat number  
9. Sort students by name  
10. Remove a student  
0. Exit  

---
## Future Enhancements
- Persist data using files or a database  
- Add GPA and grades for students  
- Implement a GUI instead of console menu  
- Support multiple departments or universities  
- Generate reports for student enrollments  

---

## Author
**Syeda Alishba**  
Mini LMS developed as a Java OOP project.
