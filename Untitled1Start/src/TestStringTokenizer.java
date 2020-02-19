import java.util.StringTokenizer;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 12:40
 * since: 1.0.0
 */
public class TestStringTokenizer {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("yang xiu qian", " ");
    while(st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
    st = new StringTokenizer("123,123,342,333,333,", ",");
    double sum = 0;
    while(st.hasMoreTokens()) {
      sum += Double.parseDouble(st.nextToken());
    }
    System.out.println(sum);
  }
}
