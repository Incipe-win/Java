import java.util.Enumeration;
import java.util.Properties;

/**
 * Description: The story has just begun!
 * @author incipe
 * create: 2020/2/13
 * since: 1.0.0
 */


public class SystemProperties {
  public static void main(String[] args) {
    Properties properties = System.getProperties();
    Enumeration keys = properties.propertyNames();
    while(keys.hasMoreElements()) {
      String key = (String)keys.nextElement();
      System.out.println(key + "=" + properties.getProperty(key));
    }
  }
}
