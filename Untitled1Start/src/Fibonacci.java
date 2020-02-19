/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 22:29
 * since: 1.0.0
 */
public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Fibonacci(10) is " + fib(10));
  }
  static long fib(int n) {
    if(n == 0 || n == 1) {
      return 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }
}
