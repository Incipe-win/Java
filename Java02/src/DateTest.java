import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/7 21:35
 * since: 1.0.0
 */
public class DateTest {
  public static void main(String[] args) throws ParseException {
    // 获取出生日期
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入出生日期, 格式为yyyy-MM-dd");
    String birthdayDateString = sc.next();

    // 通过SimpleDateFormat格式化日期，比如： 将2000-9-13转化为标准的Mon Sep 13 00:00:00 CST 1999
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date birthdayDate = sdf.parse(birthdayDateString);
    // System.out.println(birthdayDate);

    //将出生时间转换为毫秒, 以GMT（格林尼治标准时间）1970 年 1 月 1 日 00:00:00 这一刻开始
    long birthdayDateTime = birthdayDate.getTime();
    // System.out.println(birthdayDateTime);

    // 获取当前时间
    long todayTime = new Date().getTime();
    // System.out.println(todayTime);

    // 得到出生年龄至今的毫秒数
    long time = todayTime - birthdayDateTime;
    // 转换为天数
    System.out.println(time / 1000 / 60 / 60 / 24);

/*    String str = "2042-11-26";
    Date liveDate = sdf.parse(str);

    long liveDateTime = liveDate.getTime();

    long liveTime = liveDateTime - birthdayDateTime;

    System.out.println(liveTime / 1000 / 60 / 60 / 24 / 365);*/
  }
}
