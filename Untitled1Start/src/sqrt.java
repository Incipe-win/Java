/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 23:10
 * since: 1.0.0
 */
public class sqrt {
  public static void main(String[] args) {
    System.out.println(sqrt(98.0));
    System.out.println(Math.sqrt(98.0));
  }

  static double sqrt(double a) {
    double x = 1.0;
    do {
      x = (x + a / x) / 2;
      System.out.println(x + "," + a / x);
    } while (Math.abs(x * x - a) / a > 1e-6);
    return x;
  }
}
