package homework2;

public class ForthTask {
    public static void main(String[] args) {
        int[] arr = {0, 5, 2, 4, 7, 1, 3, 19};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                a += 1;
            }
        }
        System.out.println("The array consist of " + a + " odd numbers");
    }
}
