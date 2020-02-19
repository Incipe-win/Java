/**
 * Created by incipe on 2020/2/9.
 * Email:chao7461@gmail.com
 * The story has just begun !
 */

import java.util.Scanner;

/**
 * @author incipe
 */
public class LeapYear {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入年份:");
    int year = scanner.nextInt();
    if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}
