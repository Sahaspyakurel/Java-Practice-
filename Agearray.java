import java.util.Scanner;

public class Agearray {
    public static void main(String[] args) {
        int i;
        int age[] = new int[5];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the age of 5 students");
        s.close();
        for (i = 0; i < 5; i++) {
            age[i] = s.nextInt();

        }

        System.out.println("Age of 5 students are: ");
        for (i = 0; i < 5; i++) {
            System.out.println(age[i]);
        }
      
    }
    
}
