public class Evenloop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100)

        {
            if (num % 2 == 0) {
                System.out.println(num + "is even");

            } else {
                System.out.println(num + " is odd");
            }
            num++;
        }

    }
}
