import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        marks = sc.nextInt();
        if (marks > 100) {
            System.out.println("Invalid input");
        } else if (marks > 90) {
            System.out.println("Grade is AA");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade is AB");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Grade is BB");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Grade is BC");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Grade is CC");
        } else if (marks > 40 && marks <= 50) {
            System.out.println("Grade is CD");
        } else if (marks > 30 && marks <= 40) {
            System.out.println("Grade is DD");
        } else if (marks < 30) {
            System.out.println("Grade is FF");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();

    }
}