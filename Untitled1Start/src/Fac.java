/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 22:31
 * since: 1.0.0
 */
public class Fac {
  public static void main(String[] args) {
    System.out.println("Fac of 5 is " + fac(5));
  }
  static long fac(int n) {
    if(n == 0) {
      return 1;
    } else {
      return fac(n - 1) * n;
    }
  }
}
