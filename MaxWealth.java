public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 4, 3, 10 },
                { 9, 7 },
                { 1, 7, 8 },
        };
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int person : account) {
                sum += person;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
