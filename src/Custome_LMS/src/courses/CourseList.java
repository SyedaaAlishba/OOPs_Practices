package courses;

import list.customArray;

public class CourseList {
    customArray courses;
    public CourseList(int capacity){
        courses= new customArray(capacity);
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    public Course getCourseAt(int index){
        return (Course) courses.get(index);
    }

    public void removeCourse(Course c){
        courses.delete(c);
    }

    public void removeCourseByCode(String code){
        for (int i = 0; i < courses.getSize(); i++) {
            if(((Course) courses.get(i)).getCourseCode().equals(code)){
                courses.delete(getCourseAt(i));
            }
        }
    }


    public Course searchByName(String courseName){
        for (int i = 0; i < courses.getSize() ; i++) {
            if ( ((Course) courses.get(i)).getCourseName().equals(courseName) ){
                return (Course) courses.get(i);
            }
        }
        return null;
    }

    public Course searchByCode(String code){
        for (int i = 0; i < courses.getSize(); i++) {
            if(((Course) courses.get(i)).getCourseCode().equals(code)){
                return (Course) courses.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course List:\n");

        for (int i = 0; i < courses.getSize(); i++) {
            Course c = (Course) courses.get(i);
            sb.append(i + 1).append(". ").append(c).append("\n");
        }

        return sb.toString();
    }

}

