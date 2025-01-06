import java.util.Scanner;

public class Factorial {

    public int factorial(int number) {
        if (number < 0) {
            System.out.println("factorial cannot be defined for negative numbers");
            return -1;
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        int temp = 1;
        for (int i = number; i >= 2; i--) {
            temp = temp * i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        Factorial obj = new Factorial();
        int result = obj.factorial(number);
        if (result != -1) {
            System.out.println("The factorial of " + number + " is " + result);
        }
        sc.close();
    }
}
