public class Palindrome {
    public static void main(String[]args){
        int number=444;
        int reverse= 0;
        int remainder =0;
        int temp=number;
        
        while (temp!=0)
        {
           remainder=temp %10;
           reverse = reverse *10 + remainder;
           temp=temp/10;
           System.out.println("Remainder =>" + remainder + "Reverse =>" + reverse + "Temp =>" + temp);

        }
            System.out.println("The reverse of " + number + " is " + reverse);
            if (reverse == number){
                System.out.println("The number is palindrome");


            }
            else
            {
                System.out.println("The number is not palindrome");

            }
         


    }
}
