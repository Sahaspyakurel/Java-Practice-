public class Lab5Q8 {
    public static void main(String[] args) {
        // Write a java program to find the maximum and minimum value of an array.
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int max = items[0];
        int min = items[0];
        for (int i = 0; i < items.length; i++) {
            if (items[i] > max) {
                max = items[i];
            }
            if (items[i] < min) {
                min = items[i];

            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        // Get max difference
        int maxDiff = max - min;
        System.out.println("Max differences: " + maxDiff);
    }
}
