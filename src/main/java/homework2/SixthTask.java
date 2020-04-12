package homework2;

import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int[] arr2 = Arrays.copyOf(arr, 30);
        for (int i = 0; i < arr.length; i++) {
            arr2[i + 15] = arr[i] * 2;
        }
        System.out.println("Was: " + Arrays.toString(arr));
        System.out.println("Now: " + Arrays.toString(arr2));
    }
}
