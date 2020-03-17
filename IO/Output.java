package IO;

import java.lang.Math;

class Output {
  // println , print
  // public static void main(String[] args) {
  // int x = 10, y = 20;
  // char z = 'a';
  // String str = "GFG";
  // System.out.println(x);
  // System.out.println(x + y);
  // System.out.println(x + " " + y);
  // System.out.print(str + " ");
  // System.out.print("Courses");
  // System.out.print("\n");
  // System.out.println(z);
  // System.out.println(z + 1);
  // System.out.println(z + 'a');
  // }

  // printf, format
  public static void main(String[] args) {
    int x = 100, y = 200;
    double z = Math.PI;
    System.out.format("Value of x is %d\n", x);
    System.out.println(z);
    System.out.printf("x=%d and y=%d and z=%f", x, y, z);

  }
}