/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/5 23:11
 * since: 1.0.0
 */
public class UseEquals {
  public static void main(String[] args) {
    String str1 = "Handsome";
    System.out.println(str1);
    String str2 = "Big";
    System.out.println(str2);
    str1 = str2;
//    System.out.println(str1.equals(str2));
    System.out.println(str1);
    System.out.println(str2);
  }
}
