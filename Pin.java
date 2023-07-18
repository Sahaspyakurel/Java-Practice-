
import java.util.*;

public class Pin
{
    public static void main (String [] args)
    {
        final String PASSWORD = "3765";

        for (int passAttempts = 0; passAttempts < 3; passAttempts++) 
        {
            System.out.print("\nEnter Your Password: ");
            Scanner r = new Scanner(System.in);
            String inputPass = r.nextLine();

            if (!(inputPass.equals(PASSWORD))) 
            {
                System.out.println("\nWrong Password Try Again");
            } 
            else 
            {
                System.out.println("\nWelcome!");
                break;
            }
            r.close();
        }
        
    }
}
