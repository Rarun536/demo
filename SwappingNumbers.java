public class SwappingNumbers {

    public static void main(String[] args) {

        Integer x = 10;
        Integer y = 5;

        // creating temp var
        // Integer t;

        // t = x;
        // x = y;
        // y = t;

        // System.out.println(x);
        // System.out.println(y);

        // Without creating temp var

        // x = x + y; // 15
        // y = x - y; // 15-5 = 10
        // x = x - y;

        // x = x * y;
        // y = x / y;
        // x = x / y;

        // XOR way

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x);
        System.out.println(y);
    }
}
