import java.util.Scanner;

public class EngtoNepcurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in English: ");
        String inputNum = sc.next();
        String nepaliFormat = "";
        for (int i = 0; i < inputNum.length(); i++) {
            if (inputNum.charAt(i) == '.') {
                nepaliFormat += ".";
            } else {
                nepaliFormat += (char) (inputNum.charAt(i) + 2358);

            }

        }
        System.out.println("Numbers in Nepali: " + nepaliFormat);
        sc.close();
    }
}
