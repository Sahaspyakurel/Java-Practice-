import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number to check:");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is a prime number");

        } else {
            System.out.println(num +" is not a prime number");
        }
        sc.close();
    }

}
