package lab2;

/**
 *
 * @author Tatum Thomas
 */
public class Startup {
    public static void main(String[] args) {
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "20122", 2.0, "None");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java Programming", "20123", 4.0, "Intro To Programming");
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java Programming", "20124", 4.0, "Intro To Java Programming");
        
        College college = new College();
        college.addNewCourse(introProgramming);
        college.addNewCourse(introJava);
        college.addNewCourse(advancedJava);
    }
}
