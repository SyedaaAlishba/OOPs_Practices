package courses;



public class CourseList {
  private Course[] courses;
  private  int count;

    public CourseList(int size){
       this.courses = new Course[size];
       this.count=0;
    }

    public int getCount() {
        return count;
    }

    public Course getCourseAt(int index) {
        if (index >= 0 && index < count) {
            return courses[index];
        }
        return null;
    }

    public boolean addCourse(Course course){
       if(count< courses.length){
           courses[count++]= course;
           return true;
       }
        return false;
    }

    public boolean removeCourse(String code){
        for (int i = 0; i < count; i++) {
            if (courses[i] != null && courses[i].getCourseCode().equals(code)) {
                // Shift remaining courses left
                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[count - 1] = null; // Clear last slot
                count--; // Update count
                return true;
            }
        }
        return false;
    }


    public Course searchByName(String name){
        for (int i = 0; i < count; i++) {
            if ( courses[i] != null && courses[i].getCourseName().equalsIgnoreCase(name)) {
              return courses[i]; // return the whole Course object
            }
        }
        return null; // not found
    }

    public Course searchByCode(String code){
        for (int i = 0; i < count; i++) {
            if ( courses[i] != null && courses[i].getCourseCode().equals(code)) {
                return courses[i]; // return the whole Course object
            }
        }
        return null; // not found
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course List (Total Courses: ").append(count).append("):\n");
        for (int i = 0; i < count; i++) {
            Course c = courses[i];
            if (c != null) {
                sb.append("  ").append(i + 1).append(". ")
                        .append(c.getCourseName()).append(" (").append(c.getCourseCode()).append(")\n");
            }
        }
        return sb.toString();
    }
}
