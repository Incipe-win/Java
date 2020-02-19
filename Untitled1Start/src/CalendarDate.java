import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 12:55
 * since: 1.0.0
 */
public class CalendarDate {
  public static void main(String[] args) throws java.text.ParseException {
    Calendar calendar = Calendar.getInstance();
    calendar.roll(Calendar.MONTH, 1);
    System.out.println(calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DATE));

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH");
    System.out.println(formatter.format(date));

    date = new SimpleDateFormat("yyyy-MM-dd").parse("2011-2-23");
    calendar.setTime(date);
  }
}
