import java.util.TreeMap;

class StudentScoreManager {

    private TreeMap<String, Integer> studentScores = new TreeMap<>();

    public void addOrUpdateScore(String name, int score) {
        studentScores.put(name, score);
    }

    public void removeStudent(String name) {
        studentScores.remove(name);
    }

    public Integer getScore(String name) {
        return studentScores.get(name);
    }

    public void displayAllStudents() {
        System.out.println("Student Records:");

        for (String name : studentScores.keySet()) {
            System.out.println(name + " : " + studentScores.get(name));
        }
    }

    public void displayStudentsInRange(String start, String end) {

        System.out.println("Students between " + start + " and " + end);

        for (String name : studentScores.subMap(start, end).keySet()) {
            System.out.println(name + " : " + studentScores.get(name));
        }
    }
}

public class task2{
    public static void main(String[] args) {

        StudentScoreManager manager = new StudentScoreManager();

        manager.addOrUpdateScore("Ali", 85);
        manager.addOrUpdateScore("Basit", 90);
        manager.addOrUpdateScore("Hamza", 88);
        manager.addOrUpdateScore("Kiran", 95);
        manager.addOrUpdateScore("Zain", 80);

        manager.displayAllStudents();

        System.out.println("\nHamza Score: "
                + manager.getScore("Hamza"));

        manager.removeStudent("Zain");

        System.out.println("\nAfter Removing Zain:");
        manager.displayAllStudents();

        System.out.println();
        manager.displayStudentsInRange("Ali", "Kiran");
    }
}