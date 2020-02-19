import java.util.LinkedList;
import java.util.Queue;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 22:49
 * since: 1.0.0
 */
public class TestQueue {

  public static final int INT = 15;

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    for(int i = 0; i < INT; ++i) {
      q.offer(i);
    }
    for(Integer e : q) {
      System.out.print(e);
    }
    System.out.println();
    while(!q.isEmpty()) {
      System.out.print(q.poll());
    }
  }
}
