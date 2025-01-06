import java.util.Scanner;

public class PalindromeNumberCheck {

    static boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkPalindrome(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
