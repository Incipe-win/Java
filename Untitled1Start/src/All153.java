/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 23:17
 * since: 1.0.0
 */
public class All153 {
  public static void main(String[] args) {
    for(int a = 1; a <= 9; ++a) {
      for(int b = 0; b <=9; ++b) {
        for(int c = 0; c <= 9; ++c) {
          if(a * a *a + b * b * b + c * c *c == 100 *a + 10 * b + c) {
            System.out.println(100 * a + 10 * b + c);
          }
        }
      }
    }
  }
}
