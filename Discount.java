import java.util.Scanner;
public class Discount {
    public static void main (String[]args)
    {
       double total, dis;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter total amount: ");
       total= sc.nextDouble();
       if (total < 1000)
       {
        dis=0.05 * total;
       }
       else if (total >=1000 & total <=5000)
       {
           dis=0.1* total;

       }
       else 
       {
           dis=0.2*total;

       }
       System.out.println("The total payable amount is Rs. "+ (total-dis));
       sc.close();



    }
}
