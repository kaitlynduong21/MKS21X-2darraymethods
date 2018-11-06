public class Driver {
  public static String printArray(int[] ary){
    if (ary.length == 0){
      return "[]";
    }
    String output = "[";
    for (int i = 0; i < ary.length - 1; i++){
      output += ary[i] + ", ";
    }
    return output + ary[ary.length - 1] + "]";
  }
  public static String printArray(int[][] ary){
    String output = "[\n";
    for (int x = 0; x < ary.length; x++){
      output += "  " + printArray(ary[x]);
      if (x != ary.length - 1){
       output += ",\n";
      }
      else output += "\n";
    }
    return output + "]";
  }
  public static void main(String[] args) {

    System.out.println("Vivian's Driver \n");
    int[][] tester1 = new int[][]{
      {3,7,8,2,10},
      {4,6,7,4,9},
      {5,5,6,6,8},
      {10,10,5,5,0},
      {30,0,0,0,0}
    };
    int[][] tester2 = new int[][]{
      {3,4,5,10,30},
      {7,6,5,10},
      {8,7,6,5},
      {2,4,6,5},
      {10,9,8},
    };
    int[][] tester3 = new int[][]{
      {7,6,5,10},
      {8,7,6,5},
      {3,4,5,10,30},
      {2,4,6,5},
      {10,9,8},
    };
    System.out.println();
    System.out.println(" ---------------------------------");
    System.out.println("|                                 |");
    System.out.println("|              START              |");
    System.out.println("|                                 |");
    System.out.println(" ---------------------------------");
    System.out.println("int[][] tester1:");
    System.out.println(printArray(tester1));
    System.out.println();
    System.out.println("int[][] tester2:");
    System.out.println(printArray(tester2));

    System.out.println();
    System.out.println("TESTING rowSum");
    System.out.println();
    System.out.println("ArrayMethods.rowSum(tester2, 0) should return 52");
    System.out.println(ArrayMethods.rowSum(tester2, 0));
    System.out.println("ArrayMethods.rowSum(tester2, 1) should return 28");
    System.out.println(ArrayMethods.rowSum(tester2, 1));
    System.out.println("ArrayMethods.rowSum(tester2, 2) should return 26");
    System.out.println(ArrayMethods.rowSum(tester2, 2));
    System.out.println("ArrayMethods.rowSum(tester2, 3) should return 17");
    System.out.println(ArrayMethods.rowSum(tester2, 3));
    System.out.println("ArrayMethods.rowSum(tester2, 4) should return 27");
    System.out.println(ArrayMethods.rowSum(tester2, 4));
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("TESTING columnSum");
    System.out.println();
    System.out.println("ArrayMethods.columnSum(tester1, 0) should return 52");
    System.out.println(ArrayMethods.columnSum(tester1, 0));
    System.out.println("ArrayMethods.columnSum(tester1, 1) should return 28");
    System.out.println(ArrayMethods.columnSum(tester1, 1));
    System.out.println("ArrayMethods.columnSum(tester1, 2) should return 26");
    System.out.println(ArrayMethods.columnSum(tester1, 2));
    System.out.println("ArrayMethods.columnSum(tester1, 3) should return 17");
    System.out.println(ArrayMethods.columnSum(tester1, 3));
    System.out.println("ArrayMethods.columnSum(tester1, 4) should return 27");
    System.out.println(ArrayMethods.columnSum(tester1, 4));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING allRowSums");
    System.out.println();
    System.out.println("ArrayMethods.allRowSums(tester1) should return {30,30,30,30,30}");
    System.out.println(printArray(ArrayMethods.allRowSums(tester1)));
    System.out.println("\nArrayMethods.allRowSums(tester2) should return {52,28,26,17,27}");
    System.out.println(printArray(ArrayMethods.allRowSums(tester2)));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING allColSums");
    System.out.println();
    System.out.println("ArrayMethods.allColSums(tester1) should return {52,28,26,17,27}");
    System.out.println(printArray(ArrayMethods.allColSums(tester1)));
    System.out.println("\nArrayMethods.allColSums(tester2) should return {30,30,30,30,30}");
    System.out.println(printArray(ArrayMethods.allColSums(tester2)));
    System.out.println("\nArrayMethods.allColSums(tester3) should return {30,30,30,30,30}");
    System.out.println(printArray(ArrayMethods.allColSums(tester3)));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING isRowMagic");
    System.out.println();
    System.out.println("ArrayMethods.isRowMagic(tester1) should return true");
    System.out.println(ArrayMethods.isRowMagic(tester1));
    System.out.println("ArrayMethods.isRowMagic(tester2) should return false");
    System.out.println(ArrayMethods.isRowMagic(tester2));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING isColumnMagic");
    System.out.println();
    System.out.println("ArrayMethods.isColumnMagic(tester1) should return false");
    System.out.println(ArrayMethods.isColumnMagic(tester1));
    System.out.println("ArrayMethods.isColumnMagic(tester2) should return true");
    System.out.println(ArrayMethods.isColumnMagic(tester2));
    System.out.println();
    System.out.println(" ---------------------------------");
    System.out.println("|                                 |");
    System.out.println("|             FINISH              |");
    System.out.println("|                                 |");
    System.out.println(" ---------------------------------");

    //ISABELLA'S DRIVER

    System.out.println("\nIsabella's Driver \n");

    int[][] a = {
      {1,2,3,4},
      {3,5,7,2,4},
      {6,17,3}
    };
    int[][] b = {
      {1,2,3,4},
      {3,4,3}
    };
    int[][] c = {
      {1,5,8,19},
      {16,12,9,-2}
    };
    /*System.out.println("Array a: " + printArray(a));
    System.out.println("Array b: " + printArray(b));
    System.out.println("Array c: " + printArray(c) + "\n");*/
    System.out.println("int[][] a:");
    System.out.println(printArray(a));
    System.out.println("int[][] b:");
    System.out.println(printArray(b));
    System.out.println("int[][] c:");
    System.out.println(printArray(c));
    System.out.println("Testing Part 1\n");
    System.out.println("Finding the sum of each row");
    System.out.println("First Row: should return 10");
    System.out.println(ArrayMethods.rowSum(a,0));
    System.out.println("Second Row: should return 21");
    System.out.println(ArrayMethods.rowSum(a,1));
    System.out.println("Third Row: should return 26");
    System.out.println(ArrayMethods.rowSum(a,2) + "\n");
    System.out.println("Finding the sum of each column");
    System.out.println("First Column: should return 10");
    System.out.println(ArrayMethods.columnSum(a,0));
    System.out.println("Second Column: should return 24");
    System.out.println(ArrayMethods.columnSum(a,1));
    System.out.println("Third Column: should return 13");
    System.out.println(ArrayMethods.columnSum(a,2));
    System.out.println("Fourth Column: should return 6");
    System.out.println(ArrayMethods.columnSum(a,3));
    System.out.println("Fifth Column: should return 4");
    System.out.println(ArrayMethods.columnSum(a,4) + "\n\n");
    System.out.println("Testing Part 2\n");
    System.out.println("Putting all the row and column sums into arrays");
    System.out.println("Array of row sums: Should return [10, 21, 26]");
    System.out.println(printArray(ArrayMethods.allRowSums(a)));
    System.out.println("\nArray of column sums: Should return [10, 24, 13, 6, 4]");
    System.out.println(printArray(ArrayMethods.allColSums(a)));
    System.out.println("\nTesting Part 3\n");
    System.out.println("Testing whether each array has \"row magic\"");
    System.out.println("Array a: should return false");
    System.out.println(ArrayMethods.isRowMagic(a));
    System.out.println("Array b: should return true");
    System.out.println(ArrayMethods.isRowMagic(b) + "\n");
    System.out.println("Testing whether each array has \"column magic\"");
    System.out.println("Array a: should return false");
    System.out.println(ArrayMethods.isColumnMagic(a));
    System.out.println("Array c: should return true");
    System.out.println(ArrayMethods.isColumnMagic(c) + "\n");
    System.out.println("Woohoo good job!");

    //RACHEL Driver

    System.out.println("\nRachel's Driver \n");
    int[][] A = new int[][]{
      {},
      {1, 2, 3},
      {-2, 4, 0},
      {9, -2, 5},
      {-3, 7}
    };
    int[][] B = new int[][]{
      {9, 2, -7},
      {2, 2},
      {4, 5, 8}
    };
    int[][] C = new int[][]{
      {9, 8, 7, 10},
      {6, 5, 4, 11},
      {3, 2, 1, 12}
    };
    int[][] empty = new int[][]{
      {},
      {},
      {},
      {},
      {},
    };
    int[][] magicRow = new int[][]{
      {1, 1, 1, 1, 1, 1},
      {2, -2, 2, 2, -2, -2, 6},
      {3, 3, 6, -4, -2},
      {0, 10, -5, 1}
    };
    int[][] magicRow2 = new int[][]{
      {12},
      {9, 0, 2, 1},
      {-24, 36},
      {4, 4, 2, 2, 0},
      {7, 5}
    };
    int[][] magicColumn = new int[][]{
      {8},
      {-9, 0, 3, -1, 8},
      {2, 1, 2},
      {7, 7, 3, 9}
    };
    int[][] magicColumn2 = new int[][]{
      {17, 2, 7},
      {5, -6, 12, -16},
      {-14, 10, -11, 0, 8},
      {0, 2, 0, 24}
    };
    System.out.println("\n\n--------Testing printArray(int[] ary)--------");
    System.out.println("A[1]--> Should print [1, 2, 3]: " + printArray(A[1]));
    System.out.println("B[1]--> Should print [2, 2]: " + printArray(B[1]));
    System.out.println("C[2]--> Should print [3, 2, 1, 12]: " + printArray(C[2]));
    System.out.println("empty[0]--> Should print []: " + printArray(empty[0]));
    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Testing printArray(int[][] ary)--------");
    System.out.println("magicRow--> Should print [[1, 1, 1, 1, 1, 1], [2, -2, 2, 2, -2, -2, 6], [3, 3, 6, -4, -2], [0, 10, -5, 1]]: \n" + printArray(magicRow));
    System.out.println("magicColumn--> Should print [[8], [9, 0, 3, -1, 8], [2, 1, 2], [7, 7, 3, 9]]: \n" + printArray(magicColumn));
    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Phase 1 Testing--------");
    try{
      System.out.println("\n--------Testing int rowSum(int[][] ary, int x)--------");
      System.out.println("Should print 34: " + ArrayMethods.rowSum(C, 0));
      System.out.println("Should print 6: " + ArrayMethods.rowSum(A, 1));
      System.out.println("Should print 4: " + ArrayMethods.rowSum(B, 0));
      /*Commented out: Instead of an error, this should be 0
      System.out.println("\nIndex too big --> Should print printStackTrace: ");
      */
      System.out.println("Index too large--> Should print 0: " + ArrayMethods.rowSum(B,3)); //Error Testing
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when the index is too large in rowSum. Return 0 instead!");
      e.printStackTrace();
    }
    //Error Testing
    /*Commented out: Mr. K will not be testing negative indices
    try{
      System.out.println("\nNegative Index --> Should print printStackTrace: ");
      System.out.println(ArrayMethods.rowSum(B, -1)); //Error Testing
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    */
    try{
      System.out.println("Empty Array: should print 0: "+ ArrayMethods.columnSum(empty,0));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    try{
      System.out.println("\n\n--------Testing int columnSum(int[][] ary, int x)--------");
      System.out.println("Should print 18: " + ArrayMethods.columnSum(C,0));
      System.out.println("Should print 9: " + ArrayMethods.columnSum(B,1));
      System.out.println("Should print 1: " + ArrayMethods.columnSum(B,2));
      //^^^Here one of the rows is shorter than others
      System.out.println("Should print 5: " + ArrayMethods.columnSum(A,0));
      /*Commented out: Instead of an error, this should be 0
      System.out.println("\nIndex too big --> Should print printStackTrace: ");
      */
      System.out.println("Index too large--> Should print 0: " + ArrayMethods.columnSum(A, 3)); //Error Testing
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when the index is too large in columnSum. Return 0 instead!");
      e.printStackTrace();
    }
    //Error Testing
    /*Commented out: Mr. K will not be testing negative indices
    try{
      System.out.println("\nNegative Index --> Should print printStackTrace: ");
      System.out.println(ArrayMethods.columnSum(A, -1)); //Error Testing
    }
    catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    */
    try{
      System.out.println("Empty Array: should print 0: "+ ArrayMethods.columnSum(empty,0));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutofBoundsException when finding the columnSum of an empty array. Return 0 instead!");
      e.printStackTrace();
    }

    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Phase 2 Testing--------");
    try{
      System.out.println("\n--------Testing allRowSums(int[][] ary)--------");
      System.out.println("Should print [4, 4, 17]: " + printArray(ArrayMethods.allRowSums(B)));
      System.out.println("Should print [34, 26, 18]: " + printArray(ArrayMethods.allRowSums(C)));
      System.out.println("Empty Array: should print [0, 0, 0, 0, 0]: " + printArray(ArrayMethods.allRowSums(empty)));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running ArrayMethods.allRowSums on an empty array!");
      e.printStackTrace();
    }
    //Error Testing
    try{
      System.out.println("Should print [0, 6, 2, 12, 4]: " + printArray(ArrayMethods.allRowSums(A)));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running ArrayMethods.allRowSums on an array containing an empty array!");
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    try{
      System.out.println("\n--------Testing allColSums(int[][] ary)--------");
      System.out.println("Should print [18, 15, 12, 33]: " + printArray(ArrayMethods.allColSums(C)));
      System.out.println("Should print [15, 9, 1]: " + printArray(ArrayMethods.allColSums(B)));
      System.out.println("Should print [5, 11, 8]: " + printArray(ArrayMethods.allColSums(A)));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running ArrayMethods.allColSums on an uneven array!");
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    System.out.println("\n\n--------Phase 3 Testing--------");
    try{
      System.out.println("\n--------Testing isRowMagic(int[][] ary)--------");
      System.out.println("Should print true: " + ArrayMethods.isRowMagic(magicRow));
      System.out.println("Should print true: " + ArrayMethods.isRowMagic(magicRow2));
      System.out.println("Should print true: " + ArrayMethods.isRowMagic(empty));
      System.out.println("Should print false: " + ArrayMethods.isRowMagic(A));
      System.out.println("Should print false: " + ArrayMethods.isRowMagic(B));
      System.out.println("Should print false: " + ArrayMethods.isRowMagic(C));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running isRowMagic");
      e.printStackTrace();
    }
    //--------------------------------------------------------------------//
    try{
      System.out.println("\n--------Testing isColumnMagic(int[][] ary)--------");
      System.out.println("Should print true: " + ArrayMethods.isColumnMagic(magicColumn));
      System.out.println("Should print true: " + ArrayMethods.isColumnMagic(magicColumn2));
      System.out.println("Should print true: " + ArrayMethods.isColumnMagic(empty));
      System.out.println("Should print false: " + ArrayMethods.isColumnMagic(A));
      System.out.println("Should print false: " + ArrayMethods.isColumnMagic(B));
      System.out.println("Should print false: " + ArrayMethods.isColumnMagic(C));
    }
    catch (IndexOutOfBoundsException e){
      //Should not happen!
      System.out.println("You're throwing an IndexOutOfBoundsException when running isColumnMagic");
      e.printStackTrace();
    }
  }
}
