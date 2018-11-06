public class ArrayMethods{

  //PART 1
    public static int rowSum(int[][] ary, int x){
      if (x >= ary.length) {
        return 0;
      }
      int sum = 0;
      for (int i = 0; i < ary[x].length; i ++) {
        sum += ary[x][i];
      }
      return sum;
    }

    public static int findBig(int[][] ary) {
      int big = 0;
      for (int x = 0; x < ary.length; x ++) {
        if (ary[x].length >= big) {
          big = ary[x].length;
        }
      }
      return big;
    }

    public static int columnSum(int[][] ary, int x){
      if (x >= findBig(ary)) {
        return 0;
      }
      int sum = 0;
      for (int i = 0; i < ary.length; i ++) {
        if (x < ary[i].length) {
          sum += ary[i][x];
        }
      }
      return sum;
    }

    //PART 2 - use prior methods where appropriate

    public static int[] allRowSums(int[][] ary){
      int[] arraySum = new int [ary.length];
      for (int i = 0; i < ary.length; i ++) {
        arraySum[i] = rowSum(ary, i);
      }
      return arraySum;
    }


     public static int[] allColSums(int[][] ary){
       int[] arraySum = new int [findBig(ary)];
       for (int i = 0; i < findBig(ary); i ++) {
         arraySum[i] = columnSum(ary, i);
       }
       return arraySum;
     }


    //PART 3 - use prior methods where appropriate

    public static boolean isRowMagic(int[][] ary){
      int count = 0;
      for (int i = 0; i < ary.length - 1; i ++) {
        if (rowSum(ary, i) == rowSum(ary, i + 1)) {
          count++;
        }
      }
      return count == ary.length -1;
    }
      //checks if the array is row-magic (this means that every row has the same row sum).

    public static boolean isColumnMagic(int[][] ary){
      int count = 0;
      for (int i = 0; i <= findBig(ary); i ++) {
        if (columnSum(ary, i) == columnSum(ary, i + 1)) {
          count++;
        }
      }
      return count == findBig(ary);
    }
     //checks if the array is column-magic (this means that every column has the same column sum).

}
