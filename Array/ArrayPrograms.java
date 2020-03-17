package Array;

class ArrayPrograms {
  public static void main(String[] args) {

    // int[] arr = new int[10];
    // int n = 10;
    // int[] arr1 = new int[n];
    // int[] arr2 = new int[] { 10, 15, 30, 50 };
    // for (int i : arr2) {
    // System.out.println(i);
    // }

    int[] temp = new int[] { 20, 5, 7, 25 };
    System.out.println(Search(temp, 250));

  }

  public static int Search(int[] arr, int x) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

}