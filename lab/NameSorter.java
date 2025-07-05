import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("How many names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("\nAlphabetical order: " + names);

        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse alphabetical order: " + names);

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Alphabetical (Collections.sort): " + names);

        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse (Collections.sort): " + names);
        scanner.close();


    }
}
