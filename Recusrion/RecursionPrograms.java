package Recusrion;

import java.lang.reflect.Array;

public class RecursionPrograms {
  public static void main(String[] args) {

    // System.out.println(factorial(4));
    // System.out.println(SumFrom1ToN(5));
    // fun(3);
    // printNos1ToN(3);
    // printNosNto1(3);
    // printNos1ToNTailRecusion(3, 1);
    // System.out.println(factorialTailRecursive(4, 1));

    // Palindrome code
    // String str = "ababa";
    // System.out.println(isPalindrome(str, 0, str.length() - 1));

    // String to Char array
    // String str = "HImanshu";
    // System.out.println(str.length());
    // char[] arr = str.toCharArray();
    // for (char c : arr) {
    // System.out.println(c);
    // }

    // Char Array to String
    // String temp = String.valueOf(arr);
    // System.out.println(temp);

    // System.out.println(fibonacci(4));
    // System.out.println(SumOfDigits(9987));
    // System.out.println(SumOfDigitsTailRecurssion(9987, 0));

    // ROD CUTTING Problem
    // Given a rod of length n
    // find maximum number of pieces you can make such that length of every piece is
    // in a set{a,b,c}.
    // System.out.println(rodCutting(23, 11, 9, 12));
    // two pieces of size 11 and 12
    // System.out.println(rodCutting(5, 4, 2, 6));
    // -1 as rod is of odd length and all pieces in set are even

    // AllSubsetsOfString("ABC", " ", 0);

    // Given set as an array and a sum
    // Find count of subsets of the array
    // Whose sum is equal to given sum
    int[] temp = new int[] { 10, 20, 15 };
    int sum = 25;
    // int[] temp = new int[] { 10, 5, 2, 3, 6 };
    // int sum = 8;
    System.out.println(SubsetSumProblem(temp, temp.length, sum));
  }

  public static int SubsetSumProblem(int[] arr, int n, int sum) {
    if (n == 0) {
      return (sum == 0) ? 1 : 0;
    }
    return SubsetSumProblem(arr, n - 1, sum) + SubsetSumProblem(arr, n - 1, sum - arr[n - 1]);
  }

  public static void AllSubsetsOfString(String str, String curr, int index) {
    if (index == str.length()) {
      System.out.print(curr + " ");
    } else {
      AllSubsetsOfString(str, curr, index + 1);
      AllSubsetsOfString(str, curr + str.charAt(index), index + 1);
    }
  }

  public static int rodCutting(int n, int a, int b, int c) {
    if (n == 0) {
      return 0;
    }
    if (n < 0) {
      return -1;
    }
    int res = Math.max(Math.max(rodCutting(n - a, a, b, c), rodCutting(n - b, a, b, c)), rodCutting(n - c, a, b, c));
    if (res == -1) {
      return -1;
    } else {
      return res + 1;
    }
  }

  public static int SumOfDigits(int n) {
    if (n < 10) {
      return n;
    }
    return SumOfDigits(n / 10) + n % 10;
  }

  public static int SumOfDigitsTailRecurssion(int n, int k) {
    if (n < 10) {
      return n + k;
    }
    return SumOfDigitsTailRecurssion(n / 10, k + (n % 10));
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static boolean isPalindrome(String str, int startIndex, int endIndex) {
    if (startIndex == endIndex) {
      return true;
    }
    if (startIndex > endIndex) {
      return true;
    }
    if (str.charAt(startIndex) != str.charAt(endIndex)) {
      return false;
    }
    return isPalindrome(str, startIndex + 1, endIndex - 1);
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static int factorialTailRecursive(int n, int k) {
    if (n == 0) {
      return k;
    } else {
      return factorialTailRecursive(n - 1, n * k);
    }
  }

  public static int SumFrom1ToN(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + SumFrom1ToN(n - 1);
    }
  }

  public static void fun(int n) {
    if (n < 1) {
      return;
    } else {
      System.out.print(n + " ");
      fun(n - 1);
      System.out.print(n + " ");
    }
  }

  public static void printNos1ToN(int N) {
    if (N < 1) {
    } else {
      printNos1ToN(N - 1);
      System.out.print(N + " ");
    }
  }

  public static void printNos1ToNTailRecusion(int N, int p) {
    if (N < 1) {
    } else {
      System.out.print(p + " ");
      printNos1ToNTailRecusion(N - 1, p + 1);
    }
  }

  public static void printNosNto1(int N) {
    if (N < 1) {
    } else {
      System.out.print(N + " ");
      printNos1ToN(N - 1);
      // System.out.print(N + " ");
    }
  }
}