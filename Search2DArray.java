import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { -9, -8, 5, 12 },
                { 23, -24, 25, 26 },
                { 33, -34, -36, 45, 56 },
                { 12, 18, 27, 36, 72, -87, -12 },
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int target = scanner.nextInt();
        search(arr, target);
        scanner.close();
    }

    public static void search(int[][] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Searched number is at index :" + "(row:" + i + ",col:" + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Search Not Found");
        }
    }
}
