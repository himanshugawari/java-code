import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    int n = 7;
    String str1 = "0110011000010110";
    String str = "0110011";
    consecutiveOnes1(str, n);
  }

  public static void consecutiveOnes1(String str, int n) {
    char[] arr = str.toCharArray();
    System.out.println(arr);
    int[] t_arr = new int[arr.length];
    Arrays.fill(t_arr, -1);
    int t_c = 0;
    int counter=0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '0') {
        t_arr[t_c] = (int)arr[i];
        t_c++;
      } else {
        counter++;
        t_arr[i] = arr[i]++;
      }
      System.out.println(t_arr);
    }
  }

  public static void consecutiveOnes(String str, int n) {
    char[] arr = str.toCharArray();
    System.out.println(arr);
    int res = 0;
    int curr = 0;
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '0') {
        temp++;
        curr++;
        if (temp > 1) {
          curr = 0;
          temp = 0;
        }
        System.out.println("IN TEMP " + temp + " " + curr);
      } else {
        curr++;
        // res = Math.max(curr, res);
        res = (res < curr) ? curr : res;
        System.out.println(curr + " " + res);
      }
    }

    System.out.println("result " + res);
  }
}