import java.util.Stack;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 22:33
 * since: 1.0.0
 */
public class TestStack {
  static String[] months = {
    "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
  };

  public static void main(String[] args) {
    Stack<String> stk = new Stack<>();
    for(int i = 0; i < months.length; ++i) {
      stk.push(months[i]);

      System.out.println("stk = " + stk);

      System.out.println();

      for(String str : stk) {
        System.out.println(str);
      }

      System.out.println();
      System.out.println("Popping elements : ");
      while(!stk.empty()) {
        System.out.print(stk.pop());
      }
      System.out.println("Stack empty");
    }
  }
}
