import java.util.Scanner;

public class MixedPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many rows? ");
        int rows = scanner.nextInt();
        System.out.println("Here is your pattern: ");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();

        }
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}