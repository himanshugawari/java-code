package Threads;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello from main thread");

    Thread anotherThread = new AnotherThread();
    anotherThread.start();

    new Thread() {
      public void run() {
        System.out.println("Hello from anonymouns class thread");
      }
    }.start();

    System.out.println("Hello again from main thread");

    // anotherThread.start();
  }
}