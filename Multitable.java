import java.util.Scanner;
public class Multitable{
public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    for (int i=1;i<=10;i++)
    {
        int product =num*i;
        System.out.println(num+"X" + i+ "=" + product);
    }
    sc.close();
}

}

