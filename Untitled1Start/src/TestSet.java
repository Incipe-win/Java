import java.util.Set;
import java.util.HashSet;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 22:55
 * since: 1.0.0
 */
public class TestSet {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Brazil");
    set.add("Russia");
    set.add("India");
    set.add("China");
    set.add("south Africa");

    System.out.println(set.contains("China"));

    for(String str : set) {
      System.out.println(str);
    }
  }
}
