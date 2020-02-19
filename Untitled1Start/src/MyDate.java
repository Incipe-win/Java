/**
 * @author incipe
 * @date 2020/2/11
 * Email:chao7461@gmail.com
 * The story has just begun !
 */
public class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate(int y, int m, int d) {
    year = y;
    month = m;
    day = d;
  }

  void addYear() {
    ++year;
  }

  public void display() {
    System.out.println(year + "-" + month + "-" + day);
  }

  public static void main(String[] args) {
    MyDate m = new MyDate(2020, 02, 02);
    MyDate n = m;
    n.addYear();
    m.display();
    n.display();
  }
}
