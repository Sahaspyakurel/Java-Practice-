import java.util.Scanner;
public class SumofsquareofN{
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int i=sc.nextInt();
        System.out.println("Enter the ending number");

        int j=sc.nextInt();
        double sum=0;
        
        while (i <= j )

        {
            sum=sum + Math.pow(i,2);
            i++;
        }
          System.out.println("The sum is " + sum);
          sc.close();
    }
   
}
