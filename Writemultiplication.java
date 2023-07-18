import java.util.Scanner;
import java.io.FileWriter;

public class Writemultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Multiplication table of: " + num +"\n");

            for (int i = 1; i <= 10; i++) {
                int product = num * i;
                fw.write(num + "X" + String.valueOf(i) + "=" + String.valueOf(product) + "\n");

            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
