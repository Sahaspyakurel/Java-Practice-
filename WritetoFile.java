import java.io.FileWriter;

public class WritetoFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("We are learning file operation in java");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }
}
