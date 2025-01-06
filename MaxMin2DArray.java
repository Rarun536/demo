public class MaxMin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, -3, 4, -5 },
                { 67, 21, 8 },
                { -9, 0, 19 },
        };

        System.out.println("Maximum of the 2DArray is :" + max(arr));
        System.out.println("Minimum of the 2DArray is :" + min(arr));

    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        if (arr.length == 0) {
            return -1;
        }
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        return max;

    }

    static int min(int[][] arr) {
        int min = arr[0][0];
        if (arr.length == 0) {
            return -1;
        }
        for (int[] row : arr) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }

        }
        return min;

    }
}
