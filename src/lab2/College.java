package lab2;

import java.util.ArrayList;

/**
 *
 * @author Tatum Thomas
 */
public class College {
    private ArrayList<Course> courses = new ArrayList<>();
    
    public void addNewCourse(Course course){
        courses.add(course);
        System.out.println(course.getCourseName() + " was added to the list of courses.");
    }
}
