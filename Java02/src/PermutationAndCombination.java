/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/16 9:43
 * since: 1.0.0
 */
public class PermutationAndCombination {
  public static void main(String[] args) {
    int n, m;
    n = 5;
    m = 2;
    long result = factorial(n) / factorial(n - m);
    System.out.println(result);
    n = 3;
    m = 2;
    long result1 = factorial(n) / factorial(n - m);
    System.out.println(result1);
    n = 8;
    m = 2;
    long result2 = factorial(n) / factorial(n - m);
    System.out.println(result2);
    System.out.println((result + result1) / (double)result2);
  }

  static long factorial(int n) {
    long result = n;
    for (int i = n - 1; i >= 1; --i) {
      result *= i;
    }
    return result;
  }
}
