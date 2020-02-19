/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 23:01
 * since: 1.0.0
 */
public class Queen8 {
  public static void main(String[] args) {
    new Queen8().solve();
  }

  private static final int N = 8;
  private int[] y;
  int count = 0;

  public void solve() {
    count = 0;
    y = new int[N + 1];
    int x = 1;

    while (x > 0) {
      y[x]++;
      while ((y[x] <= N) && (!check(x))) {
        y[x]++;
      }
      if (y[x] <= N) {
        if (x == N) {
          count++;
          print();
        } else {
          x++;
        }
      } else {
        y[x] = 0;
        x--;
      }
    }
  }

  private boolean check(int k) {
    for (int j = 1; j < k; j++) {
      if ((Math.abs(k - j) == Math.abs(y[j] - y[k])) || (y[j] == y[k])) {
        return false;
      }
    }
    return true;
  }

  private void print() {
    System.out.println(count);
    for(int i = 1; i <= N; ++i) {
      for(int j = 1; j <= N; ++j) {
        if(j == y[i]) {
          System.out.print("x");
        } else {
          System.out.print("o");
        }
      }
      System.out.println();
    }
  }
}
