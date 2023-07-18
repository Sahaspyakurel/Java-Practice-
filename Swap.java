import java.util.Scanner;  
class Swap_With {  
    public static void main(String[] args) {  
       int x, y, t;
       Scanner sc= new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);   
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping numbers: "+x +"   " + y);  
       System.out.println( );  
       sc.close();
    }    
}  


  

