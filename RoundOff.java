import java.util.Scanner;

public class RoundOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point digit: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the value for precision: ");
        int precision = sc.nextInt();
        int j = 1;
        for (int i = 0; i < precision; i++) {
            j = j * 10;

        }
        System.out.println(num1 * j + 0.5);
        float value = (int) (num1 * j + 0.5);
        value = value / j;
        System.out.println("Value: " + value);
        sc.close();

    }
}
