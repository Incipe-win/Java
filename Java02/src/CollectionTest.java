import java.util.ArrayList;
import java.util.Collection;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/15 20:22
 * since: 1.0.0
 */
public class CollectionTest {
  public static void main(String[] args) {
    Collection<String> coll = new ArrayList<>();
    coll.add("Hello");
    coll.add("World");
    coll.add("Java");
    coll.add("Handsome");

    boolean result = coll.remove("Handsome");
    System.out.println(result);
    System.out.println(coll);

//    coll.clear();
//    System.out.println(coll);

    boolean result1 = coll.contains("java2");
    System.out.println(result1);

    System.out.println(coll.isEmpty());

    int size = coll.size();
    System.out.println(size);

    Object[] arr = coll.toArray();
    for (Object str : arr) {
      System.out.print(str + " ");
    }
  }
}
