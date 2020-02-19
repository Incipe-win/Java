/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 12:13
 * since: 1.0.0
 */
public class StringAndStringBuffer {
  public static void main(String[] args) {
    int a = 1;
    String s = "";
    StringBuilder stringbuffer = new StringBuilder();

    final int n = 10000;

    long t0 = System.currentTimeMillis();
    for(int i = 0; i < n; ++i) {
      s += a;
    }
    long t1 = System.currentTimeMillis();
    for(int i = 0; i < n; ++i) {
      stringbuffer.append(a);
    }
    long t2 = System.currentTimeMillis();

    System.out.println(t1 - t0);
    System.out.println(t2 - t1);
  }
}
