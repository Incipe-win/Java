/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 23:13
 * since: 1.0.0
 */
public class All628 {
  public static void main(String[] args) {
    for(int n = 1; n <= 9999; ++n) {
      if(n == divsum(n)) {
        System.out.println(n);
      }
    }
  }

  public static int divsum(int n) {
    int s = 0;
    for(int i = 1; i < n; ++i) {
      if(n % i == 0) {
        s += i;
      }
    }
    return s;
  }
}
