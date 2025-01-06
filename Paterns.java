public class Paterns {
    public static void main(String[] args) {
        pattern1(9);
    }

    public static void pattern1(int rows) {

        for (int row = 1; row <= rows; row++) {
            for (int col = row; col < rows; col++) {
                System.out.print(" ");
            }
            // System.out.print(" ".repeat(rows - row)); // java 11 version

            for (int k = 1; k <= row; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}