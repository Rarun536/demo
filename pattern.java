public class pattern {

    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int i = 6 - j; i >= 1; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 2; j <= 5; j++) {
            for (int i = 2; i <= j + 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
