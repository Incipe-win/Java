/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/6 22:44
 * since: 1.0.0
 */
public class NextPermutation {
  public static void permutation(char[] ch, int from, int to) {
    if (to <= 1) {
      return;
    }
    if (from == to) {
      System.out.println(ch);
    } else {
      for (int i = from; i <= to; ++i) {
        swap(ch, i, from);
        permutation(ch, i + 1, to);
        swap(ch, i, from);
      }
    }
  }

  public static void swap(char[] ch, int i, int j) {
    char tmp = ch[i];
    ch[i] = ch[j];
    ch[j] = tmp;
  }

  public static void main(String[] args) {
    char[] ch = {'a', 'b', 'c'};
    permutation(ch, 0, 2);
  }
}
