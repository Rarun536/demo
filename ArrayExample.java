import java.util.Scanner;
import java.util.Arrays;

public class ArrayExample { // Renamed class
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of Array:");

        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])); // No conflict now
        }

        scanner.close();
    }
}
