import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome(String str) {
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = str1.length();
        String reversed = "";

        for (int i = n - 1; i >= 0; i--) {
            reversed += str1.charAt(i);

        }
        if (str1.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check Palindrome or not");
        String str = scanner.nextLine();

        checkPalindrome(str);
        scanner.close();
    }

}
