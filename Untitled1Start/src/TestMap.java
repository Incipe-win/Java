import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 23:02
 * since: 1.0.0
 */
public class TestMap {
  public static void main(String[] args) {
    Map<String, String> map = new TreeMap<String, String>();
    map.put("b", "Brazil");
    map.put("r", "Russia");
    map.put("i", "India");
    map.put("c", "China");

    System.out.println(map.containsKey("c"));

    for(String key : map.keySet()) {
      System.out.println(key + ":" + map.get(key));
    }

    for(String value : map.values()) {
      System.out.println(value + ":" + map.get(value));
    }

    for(Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    Iterator it = map.entrySet().iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
