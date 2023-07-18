import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f *= i;
            }
            
            System.out.println("Factorial of " + d + " = " + f);
        }
        in.close();
    }
}
