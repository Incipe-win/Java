import java.util.ArrayList;
import java.util.Collections;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/16 20:43
 * since: 1.0.0
 *
 * 斗地主综合案列:
 *              1. 准备牌
 *              2. 洗牌
 *              3. 发牌
 *              4. 看牌
 */
public class Landlords {
  public static void main(String[] args) {
    // 1. 准备牌
    ArrayList<String> poker = new ArrayList<>();
    String[] colors = {"♠", "♥", "♣", "♦"};
    String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
    poker.add("大王");
    poker.add("小王");

    for (String number : numbers) {
      for (String color : colors) {
       poker.add(color + number);
      }
    }

    Collections.shuffle(poker);
//    System.out.println(poker);

    ArrayList<String> player1 = new ArrayList<>();
    ArrayList<String> player2 = new ArrayList<>();
    ArrayList<String> player3 = new ArrayList<>();
    ArrayList<String> cards = new ArrayList<>();

    for (int i = 0; i < poker.size(); ++i) {
      String p = poker.get(i);
      if (i >= 51) {
        cards.add(p);
      } else if (i % 3 == 0) {
        player1.add(p);
      } else if (i % 3 == 1) {
        player2.add(p);
      } else {
        player3.add(p);
      }
    }

    System.out.println("Tom" + player1);
    System.out.println("Alice" + player2);
    System.out.println("Bob" + player3);
    System.out.println("cards" + cards);
  }
}
