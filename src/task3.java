import java.util.TreeMap;
import java.util.TreeSet;

class CourseEnrollmentManager {

    private TreeMap<String, TreeSet<String>> courses = new TreeMap<>();

    public void addStudentToCourse(String course, String studentName) {

        courses.putIfAbsent(course, new TreeSet<>());

        courses.get(course).add(studentName);
    }

    public void removeStudentFromCourse(String course, String studentName) {

        if (courses.containsKey(course)) {
            courses.get(course).remove(studentName);
        }
    }

    public boolean isStudentEnrolled(String course, String studentName) {

        if (courses.containsKey(course)) {
            return courses.get(course).contains(studentName);
        }

        return false;
    }

    public void displayCourseRoster(String course) {

        if (courses.containsKey(course)) {

            System.out.println("Students in " + course + ":");

            for (String student : courses.get(course)) {
                System.out.println(student);
            }

        } else {
            System.out.println("Course not found.");
        }
    }
}

public class task3{
    public static void main(String[] args) {

        CourseEnrollmentManager manager =
                new CourseEnrollmentManager();

        manager.addStudentToCourse("OOP", "Hamza");
        manager.addStudentToCourse("OOP", "Ali");
        manager.addStudentToCourse("OOP", "Basit");

        manager.addStudentToCourse("DSA", "Zain");
        manager.addStudentToCourse("DSA", "Kiran");

        manager.displayCourseRoster("OOP");

        System.out.println();

        System.out.println(
                manager.isStudentEnrolled("OOP", "Ali"));

        manager.removeStudentFromCourse("OOP", "Ali");

        System.out.println();

        manager.displayCourseRoster("OOP");
    }
}