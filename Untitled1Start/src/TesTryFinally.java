/**
 * @author incipe
 * @date 2020/2/12
 * Email:chao7461@gmail.com
 * The story has just begun !
 */
public class TesTryFinally {
  static String output = "";

  public static void foo(int i) {
    try {
      if (i == 1) {
        throw new Exception();
      }
      output += "2";
    } catch (Exception e) {
      output += "2";
      //return;
    } finally {
      output += "3";
    }
    output += "4";
  }

  public static void main(String[] args) {
    foo(1);
    System.out.print(output);
/*
    int a = 100;
    try {
      a = 200;
    } catch (IndexOutOfBoundsException e) {
      a = 300;
    } catch (Exception e) {
      a = 300;
    } finally {
      a = 500;
    }
    a = 600;
*/
  }
}
