import java.io.*;

public class Filecopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide two file names.");
            return;
        }

        File src = new File(args[0]);
        if (!src.exists() || !src.isFile()) {
            System.out.println("Error: Source file doesn't exist or is not a regular file.");
            return;
        }

        try {
            FileInputStream in = new FileInputStream(src);
            FileOutputStream out = new FileOutputStream(args[1]);

            int ch;
            while ((ch = in.read()) != -1)
                out.write(ch);

            in.close();
            out.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
