import java.util.Scanner;

public class Largest1 {
    public static void main(String[]args)
    {
      int num1=0;
      int num2=0;
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the first number");
      num1= sc.nextInt();
      System.out.println("Enter the second number");
      num2= sc.nextInt();
      if (num1>num2) {
        System.out.println("The first number is greater");
      }

      else if(num1==num2){
        System.out.println("The number are equal");  
      }
      else{
        System.out.println("The second number is greater");
      }
    sc.close();
    }
    
}
