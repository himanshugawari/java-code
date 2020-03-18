package Matrix;

class Matrix {
  public static void main(String[] args) {
    // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
    // print2dArray(arr);

    // int[][] temp = new int[2][3];
    // print2dArray(temp);

    // Jagged Arrays
    int m = 3;
    int[][] a = new int[m][];
    print2dJaggedArray(a);

  }

  public static void print2dJaggedArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new int[i + 1];
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = i;
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
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