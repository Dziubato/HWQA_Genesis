package homework2;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write text and program will count how many 'b' you have entered");
        String string = sc.nextLine();

        char[] arr = string.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'b') {
                counter++;
            }
        }
        System.out.println("The entered text has " + counter + " letters 'b'");
        sc.close();
    }
}
