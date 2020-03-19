/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/5 22:50
 * since: 1.0.0
 */
public class getVariableType {
  public static void main(String[] args) {
    int i = 1;
    Integer i1 = 2;
    double d = 1.8;
    long l = 76;
    boolean b = false;
    String s = "123";

    System.out.println("i的类型为：" + getType(i));//返回int
    System.out.println("i1的类型为：" + getType(i1));//返回java.lang.Integer
    System.out.println("d的类型为：" + getType(d));//返回double
    System.out.println("l的类型为：" + getType(l));//返回long
    System.out.println("b的类型为：" + getType(b));//返回boolean
    System.out.println("String.valueOf(i)的类型为：" + getType(String.valueOf(i)));//返回String
    System.out.println("Integer.parseInt(s)的类型为：" + getType(Integer.parseInt(s)));//返回int
    System.out.println("Integer.valueOf(s)的类型为：" + getType(Integer.valueOf(s)));//返回java.lang.Integer
    System.out.println("Integer.valueOf(s).intValue()的类型为：" + getType(Integer.valueOf(s).intValue()));//返回int

  }

  public static String getType(Object o) {
    return o.getClass().toString();
  }

  public static String getType(int o) {
    return "int";
  }

  public static String getType(byte o) {
    return "byte";
  }

  public static String getType(char o) {
    return "char";
  }

  public static String getType(double o) {
    return "double";
  }

  public static String getType(float o) {
    return "float";
  }

  public static String getType(long o) {
    return "long";
  }

  public static String getType(boolean o) {
    return "boolean";
  }

  public static String getType(short o) {
    return "short";
  }

  public static String getType(String o) {
    return "String";
  }
}
