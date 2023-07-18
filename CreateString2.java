import java.util.Scanner;

public class CreateString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your favourite player");
        name = sc.nextLine();
        System.out.println("My favourite player is " + name);
        sc.close();
    }

}
