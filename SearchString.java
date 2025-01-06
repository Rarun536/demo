import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A String");
        String str = scanner.nextLine();
        System.out.println("Enter a character to search");
        char target = scanner.next().charAt(0);

        searchString(str, target);
        scanner.close();
    }

    static void searchString(String str, char target) {
        boolean found = false;
        int index = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                System.out.println("The character is at index :" + index);
                found = true;
            }
            index++;
        }
        if (!found) {
            System.out.println("The Character doesnot exist in the string");
        }

    }
}
