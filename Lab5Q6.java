public class Lab5Q6 {
    public static void main(String[] args) {
        // Write a java program to copy an array by i.
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newItems = new int[items.length];
        for (int i = 0; i < items.length; i++) {

            newItems[i] = items[i];

        }
        for (int i = 0; i < newItems.length; i++) {
            System.out.println(newItems[i]);
        }
    }

}
