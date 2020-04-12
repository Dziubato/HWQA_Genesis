package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 900);
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
