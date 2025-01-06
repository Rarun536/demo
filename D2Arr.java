public class D2Arr {
    public static void main(String [] args) {
        int[][] arr = {
             {1,2,3},
             {4,5,6},
             {7,8,9},
        };

        for(int[] row:arr) {     //this loop iterates the rows
            for(int num:row) {     //this loop iterates through each element in the row and num is some temporary variable
System.out.print(num + " ");
            }  
System.out.println();
        }
    }
}