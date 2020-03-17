package IO;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
//import java.util.Scanner;

class Input {
  // BufferedReader
  // public static void main(String[] args) throws IOException {
  // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  // System.out.println("Enter a Integer");
  // int x = Integer.parseInt(br.readLine());
  // System.out.println("you entered " + x);
  // }

  // Scanner
  // public static void main(String[] args) {
  // Scanner s = new Scanner(System.in);
  // System.out.println("Enter a Integer");
  // int x = s.nextInt();
  // System.out.println("you entered " + x);
  // }

  // Console Input
  public static void main(String[] args) {
    String name = System.console().readLine();
    System.out.println("Hello " + name);
  }
}