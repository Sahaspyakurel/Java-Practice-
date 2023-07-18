import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num;
       
        num= sc.nextInt();
        num= num % 7;
             
        
    
            if (num == 1) {
                System.out.println("The day is Sunday");

            } else if (num == 2) {
                System.out.println("The day is Monday");

            } else if (num == 3) {
                System.out.println("The day is Tuesday");

            } else if (num == 4) {
                System.out.println("The day is Wednesday");

            } else if (num == 5) {
                System.out.println("The day is Thursday");

            } else if (num == 6) {
                System.out.println("The day is Friday");

            }

            else if (num == 0) {
                System.out.println("The day is Saturday");

            }

        sc.close();
    }

}
