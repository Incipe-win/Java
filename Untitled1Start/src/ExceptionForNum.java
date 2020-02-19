/**
 * Created by incipe on 2020/2/12.
 * Email:chao7461@gmail.com
 * The story has just begun !
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author incipe
 */
public class ExceptionForNum {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Please input a number:");
      String s = in.readLine();
      int n = Integer.parseInt(s);
      System.out.print(n);
    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
