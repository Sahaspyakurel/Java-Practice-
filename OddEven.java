import java.util.Scanner;
public class OddEven {
    public static void main (String[]args){
        int num1=0;
    
        Scanner sc=new Scanner (System.in);
      System.out.println("Enter the number");
      num1= sc.nextInt();
    
      if (num1%2==0) {
        System.out.println("The  number is even");
      }

      else {
        System.out.println("The number is odd");
      }
      sc.close();

    }

}
