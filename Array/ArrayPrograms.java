package Array;

//import java.util.Arrays;

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

    // Delete
    // int[] temp = { 3, 8, 12, 5, 6 };
    // for (int i = 0; i < temp.length; i++) {
    // System.out.print(temp[i] + " ");
    // }
    // System.out.println(Delete(temp, 12));
    // for (int i = 0; i < temp.length; i++) {
    // System.out.print(temp[i] + " ");
    // }

    // Reverse an Array
    // int[] temp = { 1, 2, 3, 4, 5 };
    // ReverseAnArray(temp, temp.length);
    // for (int i = 0; i < temp.length; i++) {
    // System.out.print(temp[i] + " ");
    // }

    // Remove Duplicates from sorted array
    // int[] temp = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 5 };
    // RemoveDuplicatesFromAnSortedArray(temp, temp.length);
    // for (int i = 0; i < temp.length; i++) {
    // System.out.print(temp[i] + " ");
    // }

    // Left Rotate
    // int[] temp = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 5 };
    // LeftRotate(temp, temp.length);
    // for (int i = 0; i < temp.length; i++) {
    // System.out.print(temp[i] + " ");
    // }

    // Left Rotate by D
    int[] temp = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 5 };
    LeftRotateByD(temp, temp.length, 3);
    for (int i = 0; i < temp.length; i++) {
      System.out.print(temp[i] + " ");
    }

  }

  public static void LeftRotateByD(int[] arr, int n, int d) {
    int[] temp = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    }
    for (int i = 0; i < d; i++) {
      arr[n - d + i] = temp[i];
    }
  }

  public static void LeftRotate(int[] arr, int n) {
    int temp;
    temp = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n - 1] = temp;
  }

  public static int RemoveDuplicatesFromAnSortedArray(int[] arr, int n) {
    // method 1
    // int[] t = new int[n];
    // t[0] = arr[0];
    // int res = 1;
    // for (int i = 1; i < n; i++) {
    // if (t[res - 1] != arr[i]) {
    // t[res] = arr[i];
    // res++;
    // }
    // }
    // for (int i = 0; i < res; i++) {
    // arr[i] = t[i];
    // }
    // return res;

    // method 2
    int res = 1;
    for (int i = 1; i < n; i++) {
      if (arr[res - 1] != arr[i]) {
        arr[res] = arr[i];
        res++;
      }
    }
    return res;
  }

  public static void ReverseAnArray(int[] arr, int n) {
    int l = 0, h = n - 1;
    while (l < h) {
      int temp = arr[l];
      arr[l] = arr[h];
      arr[h] = temp;
      l++;
      h--;
    }
  }

  public static int Delete(int[] arr, int x) {
    int i;
    int n = arr.length;
    for (i = 0; i < n; i++) {
      if (arr[i] == x) {
        break;
      }
    }
    if (i == n) {
      return n;
    }
    for (int j = i; j < n - 1; j++) {
      arr[j] = arr[j + 1];
    }
    return n - 1;
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