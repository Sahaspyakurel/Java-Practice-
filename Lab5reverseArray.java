import java.util.Arrays;

public class Lab5reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] reverseArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            // System.out.println("Index" + i + ": " + arr[i]);
            reverseArr[index] = arr[i];
            index++;
        }
        System.out.println("Reverse Array: " + Arrays.toString(reverseArr));
    }
}
