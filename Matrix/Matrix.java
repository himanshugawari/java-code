package Matrix;

class Matrix {
  public static void main(String[] args) {
    // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
    print2dArray(arr);

  }

  public static void print2dArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}