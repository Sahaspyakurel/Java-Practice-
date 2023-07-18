import java.util.Random;
import java.util.Scanner;
  
public class Guess2{
    public static void main(String[] args)
    {
        int answer, guess;
        final int MAX = 100;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer = rand.nextInt(MAX) + 1;
        while (!correct) {
  
            System.out.println(
                "Guess a number: ");
            guess = in.nextInt();
            if (guess > answer) {
                System.out.println("Lower, try again");
            }
            else if (guess < answer) {
                System.out.println("Higher, try again");
            }
            else {
  
                System.out.println(
                    "You guessed the number correctly.");
  
                correct = true;
            }
        }
       in.close();
    }
}