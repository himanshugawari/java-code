package String;

import java.util.Arrays;

public class StringProg {

  public static void main(String[] args) {
    // String s = "geeksforgeeks";
    // System.out.println(s.indexOf("geeks"));
    // System.out.println(s.indexOf("for"));
    // System.out.println(s.substring(1, 3));

    // ANAGRAM
    String s1 = "geeks";
    String s2 = "ekesg";
    System.out.println(anagram(s1, s2));

    int[] fi = new int[256];
    for (int i : fi) {
      System.out.print(i + " ");
    }
    System.out.println();
    Arrays.fill(fi, -1);
    for (int i : fi) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println(Integer.MAX_VALUE);
  }

  public static boolean anagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] count = new int[256];
    for (int i = 0; i < s1.length(); i++) {
      count[s1.charAt(i)]++;
    }
    for (int i = 0; i < s1.length(); i++) {
      count[s2.charAt(i)]--;
    }
    for (int i = 0; i < 256; i++) {
      if (count[i] != 0) {
        return false;
      }
    }
    return true;
  }
}