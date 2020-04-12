package homework2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number of the lines");
        int linesNumber = sc.nextInt();
        for (int k = 1; k <= linesNumber; k++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                for (int z = 0; z < 3; z++) {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
