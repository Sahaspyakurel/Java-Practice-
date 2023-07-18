public class Pattern1 {
    public static void main(String[] args) {
        int i, j, num;
        for (i = 1; i < 6; i++) {
            num = i;
            for (j = i; j > 0; j--) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
