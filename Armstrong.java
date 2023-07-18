public class Armstrong {
  public static void main(String[] args) {
    int number = 153;
    int sum = 0;
    int remainder = 0;
    int temp = number;

    while (temp != 0) {
      remainder = temp % 10;
      sum = sum + (remainder * remainder * remainder);
      temp = temp / 10;
    }
    if (sum == number)
      System.out.println("The number is Armstrong");
    else
      System.out.println("The number is not Armstrong");

  }
}



