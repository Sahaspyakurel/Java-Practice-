import java.util.Scanner;

public class Sumarray {
    public static void main(String[] args) {
        int sum = 0;
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }

        System.out.println("Following are the array elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + "\t");
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + a[i];
        }
        System.out.println("\nThe total sum of numbers is: " + sum);
        double average = (double) (sum / 10);
        System.out.println("The average of numbers is: " + average);
        sc.close();
        
    }
}
