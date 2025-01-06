public class MyName {
    public static void main(String[] args) {
        int rows = 4;
        String name = "ARUN";

        for (int j = 1; j <= rows; j++) {
            for (int i = rows - j; i > 0; i--) {
                System.out.print("_");
            }
            System.out.println();
            System.out.print("A");
            System.out.println();
            System.out.print("R R");
            System.out.println();
            System.out.print("U  U");
            System.out.println();
            System.out.print("N   N");

        }

    }
}
