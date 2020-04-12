package homework1;


public class FifthTask {
    public static void main(String[] args) {
        final double a = 10;
        final double b = 7;
        final double c = 7;
        double p = (a+b+c)/2;

        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(square);
    }


}
