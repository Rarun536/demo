import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int number = sc.nextInt();

            if (number <= 1) {
                System.out.println("Not Prime");
                return;
            }
            if (number == 2) {
                System.out.println("Prime");
                return;
            }
            if (number % 2 == 0) {
                System.out.println("Not Prime");
                return;
            }
            for (int i = 3; i * i <= number; i += 2) {
                if (number % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
            sc.close();
        }
    }
}
