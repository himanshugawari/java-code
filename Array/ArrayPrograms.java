package Array;

import java.util.Arrays;

class ArrayPrograms {
  public static void main(String[] args) {

    // int[] arr = new int[10];
    // int n = 10;
    // int[] arr1 = new int[n];
    // int[] arr2 = new int[] { 10, 15, 30, 50 };
    // for (int i : arr2) {
    // System.out.println(i);
    // }

    // Search
    // int[] temp = new int[] { 20, 5, 7, 25 };
    // System.out.println(Search(temp, 250));

    // Insert an elemnet at a position
    // int[] temp = new int[5];
    // Arrays.fill(temp, -1);
    // temp[0] = 5;
    // temp[1] = 7;
    // Insert(temp, temp.length - 1, 3, 2);
    // Insert(temp, temp.length - 1, 10, 2);
    // for (int i = 0; i < temp.length; i++) {
    // System.out.print(temp[i] + " ");
    // }

  }

  public static int Insert(int[] arr, int n, int x, int position) {
    int capacity = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] != -1) {
        capacity = i + 1;
      }
    }
    if (n == capacity) {
      return n;
    }
    int index = position - 1;
    for (int i = n - 1; i >= index; i--) {
      arr[i + 1] = arr[i];
    }
    arr[index] = x;
    return n + 1;
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