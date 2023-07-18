import java.util.Scanner;

public class Lab5Q3 {
    public static void findValue(int[] items, int value) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == value) {
                System.out.println("Value found at index" + i);
                break;
            }
        }
        System.out.println("Value not found");
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
        System.out.println("Enter the value to search");
        int value = sc.nextInt();
        findValue(items, value);
        sc.close();
    }
}
