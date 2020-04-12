package homework2;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number from 5 to 15 (these numbers included");
        int number = sc.nextInt();
        int result = 1;
        if (number > 4 && number < 16) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println(result);
        } else {
            System.out.println("The number is out of the range.");
        }
    }
}
