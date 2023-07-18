import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Input a integer less than ten billon");

        long p = n.nextLong();
        int count = 0;

        while (p != 0) {
            p /= 10;
            count++;
        }
        System.out.println("The number of digits is   " + count);
        n.close();

    }
}