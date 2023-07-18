import java.io.*;

public class FileOperation {
    public static void main(String[] args) {
        try {
            File f = new File("test.txt");
            if (f.createNewFile()) {
                System.out.println("New file created");
            } else {
                System.out.println("File already exists");

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
