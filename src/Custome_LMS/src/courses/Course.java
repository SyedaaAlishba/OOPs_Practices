package courses;

import java.util.Objects;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String name, String code){
        this.courseName= name;
        this.courseCode=code;
    }

    //Suppose SE students have same course name like OOps but different courseNo
    public Course(Course other, String newCode){
        this.courseName= other.courseName;
        this.courseCode= newCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourse() {
        return this.getCourseName() + this.getCourseCode();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course Name = ").append(getCourseName()).append("\n");
        sb.append("Course Code = ").append(getCourseCode());
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Course course = (Course) object;
        return Objects.equals(courseName, course.courseName) && Objects.equals(courseCode, course.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode);
    }
}
