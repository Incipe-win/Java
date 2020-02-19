import java.util.Arrays;
import java.util.Random;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 21:24
 * since: 1.0.0
 */
public class TestArraysSort {
  static Random r = new Random();
  static String source = "QWERTYUIOPASDFGHJKLZCXBNMV12413";
  static char[] src = source.toCharArray();

  static String randString(int length) {
    char[] buf = new char[length];
    for(int i = 0; i < length; ++i) {
      int rnd = Math.abs(r.nextInt()) % src.length;
      buf[i] = src[rnd];
    }
    return new String(buf);
  }
  static String[] randStrings(int length, int size) {
    String[] s = new String[size];
    for(int i = 0; i < size; ++i) {
      s[i] = randString(length);
    }
    return s;
  }
  public static void print(String[] s) {
    for(int i = 0; i < s.length; ++i) {
      System.out.print(s[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    String[] s = randStrings(4, 10);
    print(s);
    Arrays.<String>sort(s);
    print(s);
    int loc = Arrays.<String>binarySearch(s, s[2]);
    System.out.println("Location of " + s[2] + " is " + loc);
  }
}
