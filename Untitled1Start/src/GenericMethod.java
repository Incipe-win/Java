import java.util.*;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 22:18
 * since: 1.0.0
 */
public class GenericMethod {
  public static void main(String[] args) {
    Date date = BeanUtil.<Date>getInstance("java.util.Date");
    System.out.println(date);
  }
}

class BeanUtil {
  public static <T> T getInstance(String clzName) {
    try {
      Class c = Class.forName(clzName);
      return (T) c.newInstance();
    }
    catch (ClassNotFoundException ex){}
    catch (InstantiationException ex) {}
    catch (IllegalAccessException ex) {}
    return null;
  }
}
