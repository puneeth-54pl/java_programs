import java.util.Vector;

public class StudentNames {
    public static void main(String[] args) {
        Vector<String> studentNames = new Vector<>();

        if (args.length != 5) {
            System.out.println("Please enter exactly 5 student names.");
            return;
        }

        for (String str:args) {
            studentNames.add(str);
        }

        System.out.println("Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
