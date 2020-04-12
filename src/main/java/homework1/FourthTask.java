package homework1;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println("Input a");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Input b");
        Scanner scan2 = new Scanner(System.in);
        int second = scan2.nextInt();

        System.out.println("The square of parallelogram is " + (first + second) * 2);
    }
}
