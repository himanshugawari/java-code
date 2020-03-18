package Matrix;

class Matrix {
  public static void main(String[] args) {
    // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
    // print2dArray(arr);

    // int[][] temp = new int[2][3];
    // print2dArray(temp);

    // Jagged Arrays (rows are of different sizes)
    // int m = 3;
    // int[][] a = new int[m][];
    // print2dJaggedArray(a);

    // Snake Pattern
    // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
    // printMatrixInSnakePattern(arr);

    // Boundary Traversal
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
    BoundaryTraversal(arr);
  }

  public static void BoundaryTraversal(int[][] arr) {
    if (arr.length == 1) {
      for (int i = 0; i < arr[0].length; i++) {
        System.out.print(arr[0][i] + " ");
      }
    } else if (arr[0].length == 1) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i][0] + " ");
      }
    } else {
      for (int i = 0; i < arr[0].length; i++) {
        System.out.print(arr[0][i] + " ");
      }
      for (int i = 1; i < arr.length; i++) {
        System.out.print(arr[i][arr[0].length - 1] + " ");
      }
      for (int i = arr[0].length - 2; i >= 0; i--) {
        System.out.print(arr[arr.length - 1][i] + " ");
      }
      for (int i = arr.length - 2; i >= 1; i--) {
        System.out.print(arr[i][0] + " ");
      }
    }
  }

  public static void printMatrixInSnakePattern(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < arr[i].length; j++) {
          System.out.print(arr[i][j] + " ");
        }
      } else {
        for (int j = arr[i].length - 1; j >= 0; j--) {
          System.out.print(arr[i][j] + " ");
        }
      }
    }
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