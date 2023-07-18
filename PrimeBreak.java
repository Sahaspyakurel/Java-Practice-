import java.util.Scanner;

public class PrimeBreak {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        System.out.print("Enter any number : ");
        
        int i,num;
        num = aa.nextInt();
        aa.close();
        for (i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                break;
            }
        }
        if (num == i) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        
    }
    
}
