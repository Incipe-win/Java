import java.util.ArrayList;
import java.util.Collection;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/15 22:12
 * since: 1.0.0
 */
public class IteratorTest {
  public static void main(String[] args) {
    Collection<String> coll = new ArrayList<>();
    coll.add("Hello");
    coll.add("World");
    coll.add("Java");
    coll.add("My");
    coll.add("Name");
    coll.add("is");
    coll.add("Programmer");

//    boolean b = it.hasNext();
//    System.out.println(b);
//    String s = it.next();
//    System.out.println(s);

    for (String s : coll) {
      System.out.print(s + " ");
    }
    System.out.println("");
  }
}
