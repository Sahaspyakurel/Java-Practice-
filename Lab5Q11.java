public class Lab5Q11 {
    public static void main(String[] args) {
        // Write a Java Program to find the duplicate values of an array of integer
        // values.
        int[] items = { 1, 3, 3, 4, 4, 1, 6 };
        int len = items.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) { // fix
                if (items[i] == items[j]) {
                    System.out.println(items[i]);
                }
            }
        }

    }
}
