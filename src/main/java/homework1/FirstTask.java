package homework1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Input first digit");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Input second digit");
        Scanner scan2 = new Scanner(System.in);
        int second = scan2.nextInt();
        System.out.println("Input third digit");
        Scanner scan3 = new Scanner(System.in);
        int third = scan3.nextInt();
        if (first > second && first > third) {
            System.out.println("The first number is the biggest");
        } else if (second > first && second > third) {
            System.out.println("The second is the biggest");
        } else if (third > second && third > first) {
            System.out.println("The third digit is the biggest");
        } else {
            System.out.println("All digits are equal");
        }
    }
}
