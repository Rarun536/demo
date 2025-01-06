
public class PangramChecker {
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index = 0;

        sentence = sentence.toLowerCase();
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                index = c - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "abcd efgh ijkl";
        if (isPangram(sentence)) {
            System.out.println("It is Pangram"); // Output: true
        } else {
            System.out.println("Its not Pangram");
        }
    }
}
