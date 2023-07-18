import java.util.Scanner;

public class SortnumberArray {
    public static void main(String[] args) {
        int temp;
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        System.out.println("Following are the array elements before sorting: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + "\t");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Elements of array sorted in ascending order are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + "\t");
        }
        sc.close();
    }
}
