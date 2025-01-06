import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int[] arr = { -1, 23, -98, 78, 0, -24, -87, -8765 };
        swap(arr, 0, 6);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
