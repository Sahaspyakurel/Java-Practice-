import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {

        int a[] = new int[10];
        int largest = a[0];
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
        for (int i = 1; i < 10; i++) {
            if (largest < a[i])
                largest = a[i];
        }
        System.out.println("\n" + "The largest number is " + largest);
        sc.close();
    }
}
