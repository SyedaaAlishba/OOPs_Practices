package student;

import courses.Course;
import semester.Semester;

import java.util.Arrays;


public class Student {

    private String name;
    private String seatNo;
    private Semester[] semesters;

    private static final int TOTAL_SEMESTERS = 8;
    private int semCount; // counts how many semesters have been added

    private static final String SEATNO_PATTERN = "^B\\d{10,12}$";
    // Example: B24110006148  (B + 11 digits)

    public Student(String name, String seatNo, Semester semesterForSemNo) {
        this.name = name;
        setSeatNo(seatNo);
        this.semesters = new Semester[TOTAL_SEMESTERS];

        // Initialize all semesters as empty (optional)
        for (int i = 0; i < TOTAL_SEMESTERS; i++) {
            this.semesters[i] = null; // or new Semester(i+1, new CourseList(0));
        }

        // Place the passed semester in the correct index
        int index = semesterForSemNo.getSemNumber() - 1;
        if (index >= 0 && index < TOTAL_SEMESTERS) {
            this.semesters[index] = semesterForSemNo;
            // Set semCount to be at least (index + 1) to include this semester
            this.semCount = index + 1;
        }else {
            System.out.println("Error: Semester " + semesterForSemNo.getSemNumber() + " is out of bounds (max: " + TOTAL_SEMESTERS + ")");
        }
    }

    public String getName() {
        return name;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeatNo(String seatNo) {
        if (!seatNo.matches(SEATNO_PATTERN)) {
            throw new IllegalArgumentException(
                    "Invalid seat number format! Must be like B24110006198"
            );
        }
        this.seatNo = seatNo;
    }

    public boolean enrollCourse(Course course, int semNo){
        // find existing semester
        Semester sem = getSemester(semNo);
        // create new semester if not found
        if(sem == null){
            if (semNo < 1 || semNo > TOTAL_SEMESTERS) return false;
            sem = new Semester(semNo, 6);
            semesters[semNo - 1] = sem;
            semCount++; // count of total semesters
        }
        // delegate adding course to the Semester
        return sem.addCourse(course);
    }

    //dropCourse delegating to Semester
    public boolean dropCourse(String courseCode, int semNo) {
        Semester sem = getSemester(semNo);
        if (sem == null) return false;
        return sem.removeCourse(courseCode);
    }


    // Public helper to find a student's semester by its number.

    public Semester getSemester(int semNo) {
        int index = semNo - 1;
        if (index >= 0 && index < TOTAL_SEMESTERS) {
            return semesters[index];
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name = ").append(name).append("\n");
        sb.append("SeatNo = ").append(seatNo).append("\n");
        sb.append("Current Semester = ").append(semCount);
        return sb.toString();
    }
}