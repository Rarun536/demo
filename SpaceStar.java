public class SpaceStar {
    public static void main(String[] args) {
        int rows = 5;
        for (int j = 1; j <= rows; j++) {
            for (int i = rows - j; i > 0; i--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}