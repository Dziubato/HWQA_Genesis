package homework1;

public class SecondTask {
    public static void main(String[] args) {
        String str = "133";
        String str2 = "321";
        Integer i = Integer.valueOf(str);
        Integer i2 = Integer.valueOf(str2);
        int result = i + i2;
        String res = Integer.toString(result);
        System.out.println(res);
    }
}
