public class AbsoluteValue {
     public static void main (String[]args)
     {
        int number = -10;
        int absolute = 0;
        if (number < 0)
        {
           absolute = number * -1;
        }
        else{
            absolute = number;

        }

        System.out.println("The absolute value of " + number + " is " + absolute);

     }
}

