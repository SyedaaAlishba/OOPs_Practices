package courses;

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
        return "Course name "+getCourseName()+" Course code "+getCourseCode();
    }
}
