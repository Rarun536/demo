import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        Reverse(str);
        Reverse1(str);
        scanner.close();
    }

    public static void Reverse1(String str) {
        int n = str.length();
        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Original String is :" + str);
        System.out.println("Reversed String is :" + reverse);
    }

    public static void Reverse(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        String reversed = new String(arr);

        System.out.println("Original String is :" + str);
        System.out.println("Reverse String is :" + reversed);

    }

}
