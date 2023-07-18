import java.util.Scanner;

public class DetailsStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String college;
        sc.nextLine();
        System.out.print("Enter your college:");
        college = sc.nextLine();
        System.out.println();
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My college name is " + college + ".");
        sc.close();
    }

}
