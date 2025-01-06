import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = { -1, 34, -987, -8765, 0, 90 };
        System.out.println("Maximum of the array is :" + max(arr));
        System.out.println("Minimum of the array is :" + min(arr));
    }

    // Finding Max of the Array
    public static int max(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Finding Max from a Range
    public static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[start] > max) {
                max = arr[start];
            }
        }
        return max;
    }

    // Finding min of the array
    public static int min(int[] arr) {

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }
}