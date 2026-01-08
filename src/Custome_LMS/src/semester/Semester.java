package semester;

import courses.Course;
import courses.CourseList;

public class Semester {
    private int semNumber;
    private CourseList semCourses;

    public Semester(int semNumber, int maxCourses) {
        this.semNumber = semNumber;
        this.semCourses = new CourseList(maxCourses); // create empty course list
    }

    public Semester(int semNumber, CourseList courseList) {
        this.semNumber = semNumber;
        this.semCourses = courseList;
    }

    public int getSemNumber() {
        return semNumber;
    }

    public boolean addCourse(Course course) {
       semCourses.addCourse(course);
       return true;
    }

    public boolean removeCourse(String code) {
        semCourses.removeCourseByCode(code);
        return true;
    }

    @Override
    public String toString() {
        return "Semester " + semNumber + " with " + semCourses + " courses";
    }

//    public int getCourseCount() {
//        return semCourses.getCount();
//    }
    public Course getCourse(int index){
        return semCourses.getCourseAt(index);
    }
}
