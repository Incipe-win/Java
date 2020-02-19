/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 12:21
 * since: 1.0.0
 */
public class TestStringMethod {
  public static void main(String[] args) {
    String s = new String("yangxiuqian");

    System.out.println(s.length());
    System.out.println(s.indexOf('i'));
    System.out.println(s.indexOf("qi"));
    System.out.println(s.startsWith("xi"));
    System.out.println(s.equals("yangxiuqian"));
    System.out.println(s.equalsIgnoreCase("YANGxiuqian"));
    System.out.println(s.compareTo("yangxiuqian"));
    System.out.println(s.charAt(2));
    System.out.println(s.substring(2, 5));
  }
}
