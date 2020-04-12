package homework1;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println("Input first digit");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        if (first % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
