import java.util.Scanner;

public class Inches {
    public static void main(String []args)
    {
       Scanner r=new Scanner(System.in);
       System.out.println("Input");
       int inches= r.nextInt();
       int a=inches/12;
       int b= inches%12;
       System.out.println("Output:"+a+"ft"+b+"inches");
    r.close();

    }
}
