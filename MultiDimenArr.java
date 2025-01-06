public class MultiDimenArr {
    public static void main(String [] args) {
        int[][] arr = new int[3][4];

        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[0][2] = 300;
        arr[0][3] = 400;
        arr[2][0] = 100;
        arr[2][1] = 1;


    
    //    for(int i = 0; i<arr.length; i++){
      //      for(int j = 0; j<arr[i].length; j++) { //not understood, here rows length is 1lessthan the column length so using arr[i]
        //        System.out.print(arr[i][j] + " ");
          //  }
        
//System.out.println();
        for(int[] i : arr) {
            for (int rows:i) {
                System.out.println(rows);
            }
        }
    }
}
   //}
//}