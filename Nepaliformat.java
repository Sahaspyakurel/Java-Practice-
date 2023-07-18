import java.util.Scanner;

public class Nepaliformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String finalNumber = "";
        System.out.println("Enter any number: ");
        String inputNum = sc.next();
        int count = 0;
        StringBuilder stringNum = new StringBuilder(inputNum);
        stringNum.reverse();
        for (int i = 0; i < stringNum.length(); i++) {
            char ch = stringNum.charAt(i);
            finalNumber = finalNumber + ch;
            count++;
            if (count != 1 && (count % 2) != 0) {
                if (count == stringNum.length()) {
                    break;
                }
                finalNumber = finalNumber + ",";

            }

        }
        StringBuilder result = new StringBuilder(finalNumber);
        System.out.println(result.reverse());
        sc.close();

    }
}
