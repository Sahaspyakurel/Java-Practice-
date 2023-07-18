public class CharOrDigit {
    public static void main (String []args)
    {
      char ch = '6';
      if ((ch >=65 && ch<= 90) || (ch>= 97 && ch <= 122)){
          System.out.println(ch + "is a letter");
      }
      else if (ch >=48 && ch<= 57) {
        System.out.println(ch + " is a Digit");

    } else {
        System.out.println(ch + " is neither letter nor a digit");

    
      }

    }
}
