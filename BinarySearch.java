import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 4, 6, 7, 8, 9, 10, 12, 13, 14, 16, 17, 18, 19, 20, 22, 23, 24, 25, 30 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to search");
        int target = scanner.nextInt();
        int ans = (binarySearch(arr, target));
        System.out.println(ans);
        scanner.close();

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
