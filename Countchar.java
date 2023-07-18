
public class Countchar {
    public static void main(String[] args) {
        String password= "awdjjASHUVSJ@#$%$451";
        int upper=0, lower=0, number=0, special=0;
        for (int i=0;i<password.length(); i++){
            char ch=password.charAt(i);
            System.out.println(ch);
            if (ch>='A' && ch<='Z')
            {
                upper ++;
            }
            else if (ch>='a' && ch<='z')
            {
             lower ++;
            }
            else if (ch>='0' && ch<='9')
            {
               number ++;
            }
            else {
                special ++;
            }
        }
        System.out.println("Lower case letter: " + lower);
        System.out.println("Upper case letter: " + upper);
        System.out.println("Numbers: " + number);
        System.out.println("Special characters: " + special);
        
    }
    
}
