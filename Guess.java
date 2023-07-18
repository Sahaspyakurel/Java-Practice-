
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (100 - 1 + 1) + 1);
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (count <= 10) {
            System.out.print("Guess" + count + ":");
            int guess = sc.nextInt();
            
            if (guess == random) {
                System.out.println("Hint: Higher");

            } else {
                System.out.println("Hint: Lower");

            }
            if (count == 10) {
                System.out.println(".......................................");
                System.out.println("Sorry! Better luck next time");
                System.out.println(".......................................");

            }
            count++;
        }
        sc.close();
    }
}

