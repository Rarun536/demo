import java.util.Scanner;

public class SearchArray {

    static void search(int[] arr, int number) {
        boolean found = false;
        int index = 0;
        for (int num : arr) {
            if (num == number) {
                System.out.println("The Number exist in the index :" + index);

                found = true;

            }
            index++;
        }
        if (!found) {
            System.out.println("The Number not exist in the Array");
        }
    }

    static void search(int[] arr, int start, int end, int number) {
        boolean found = false;
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                System.out.println("Searched number exists at inde :" + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Search Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 11, 2, 33, 44, 98, 766, 0, 654 };
        System.out.println("Enter Number to search");
        int number = scanner.nextInt();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        search(arr, start, end, number);
        scanner.close();
    }
}
