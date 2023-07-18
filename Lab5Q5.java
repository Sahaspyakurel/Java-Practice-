import java.util.Arrays;

public class Lab5Q5 {
    public static void main(String[] args) {
        // 5. Write a Java Program to remove a specific element from an array.
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newItems = new int[items.length - 1];
        int index = 0;
        int itemtoRemove = 7; // enter a item to be removed
        for (int i = 0; i < items.length; i++) {
            if (items[i] != itemtoRemove) {
                newItems[index] = items[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newItems));
    }
}