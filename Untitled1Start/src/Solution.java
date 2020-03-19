/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/5 22:38
 * since: 1.0.0
 */
public class Solution {
  public static void main(String[] args) {
    final int a1 = 123456789;
    int a = 123456789;
    System.out.println(a);
    System.out.println(getType(a1));
    System.out.println(getType(a1 + ""));
  }

  //获取变量类型方法
  public static String getType(Object o) {
    //使用int类型的getClass()方法
    return o.getClass().toString();
  }
}

