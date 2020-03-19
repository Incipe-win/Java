import java.util.Calendar;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/7 22:40
 * since: 1.0.0
 */
public class CalendarTest {
  public static void main(String[] args) {
    demo01();
    demo02();
  }

  private static void demo02() {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, 9999);
    c.set(Calendar.MONTH, 8);
    c.set(Calendar.DATE, 9);
  }

  public static void demo01() {
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    System.out.println(year);


    int month = c.get(Calendar.MONTH);
    System.out.println(month + 1);


    int day = c.get(Calendar.DATE);
    int day1 = c.get(Calendar.DAY_OF_MONTH);

    System.out.println(day);
    System.out.println(day1);

    System.out.printf("%d 年 %d 月 %d 日", year, month + 1, day);
  }
}
