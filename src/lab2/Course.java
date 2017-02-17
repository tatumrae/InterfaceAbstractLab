package lab2;

/**
 *
 * @author Tatum Thomas
 */
public interface Course {
    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    public abstract double getCredits();

    public abstract void setCredits(double credits);

    public abstract String getPrerequisites();
    
    public abstract void setPrerequisites(String prerequisites);
    
}
