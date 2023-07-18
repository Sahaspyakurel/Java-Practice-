import java.util.Scanner;

public class GradeTernary {
    public static void main(String[] args) {
        int marks;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  marks");
        marks=s.nextInt();
        String sc=marks<100?(marks<=90?(marks<=80?(marks<=70?(marks<=60?(marks<=50?(marks<=40?(marks<=30?(marks<30?"You have failed":" Grade is FF"):"Grade is DD"):"Grade is CD"):"Grade is CC"):"Grade is BC"):"Grade is BB"):"Grade is AB"):"Grade is AA"):"Invalid Input";

        System.out.println(sc);

        s.close();
    }
}
