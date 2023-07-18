import java.util.Scanner;

public class Lab5Q2 {
    public static void displayAverage(int[] items) {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];

        }
        System.out.println("Average of the elements is: " + sum / items.length);
    }

    public static void displaySum(int[] items) {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        System.out.println("Sum of the elements is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] items = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            System.out.println("Number" + (i + 1) + ": ");
            items[i] = sc.nextInt();
        }
        displaySum(items);
        displayAverage(items);
        sc.close();

    }
}
