/**
 * Created by incipe on 2020/2/9.
 * Email:chao7461@gmail.com
 * The story has just begun !
 */

import java.util.Scanner;

/**
 * @author incipe
 */
public class ScannerTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input a number:");
    int a = scanner.nextInt();
    System.out.printf("%d的平方是%d\n", a, a * a);
  }
}