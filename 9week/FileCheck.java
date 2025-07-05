import java.io.File;
import java.util.Scanner;

public class FileCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        
        File file = new File(filePath);
        
        if (file.exists()) {
            System.out.println("File exists!");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Hidden: " + file.isHidden());
        } else {
            System.out.println("File does not exist.");
        }
        
        scanner.close();
    }
}
