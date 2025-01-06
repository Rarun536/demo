public class Palin {
    public static void main(String[] args) {

        String str = "";

        System.out.println(isPalindrome(str));
        StringBuilder sb = new StringBuilder("");
        Check(sb);
    }

    public static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;

    }

    static void Check(StringBuilder sb) {

        if (sb == null || sb.length() == 0) {
            System.out.println("String is empty , Please Enter proper String");
            return;

        }
        String original = sb.toString();
        String reversed = new StringBuilder(sb).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
