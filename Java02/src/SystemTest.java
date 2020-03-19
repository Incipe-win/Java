import java.util.Arrays;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/11 22:02
 * since: 1.0.0
 */
public class SystemTest {
  public static void main(String[] args) {
    demo1();
    demo2();
  }

  private static void demo2() {
    int[] src = {1, 2, 3, 4, 5};
    int[] dest = {6, 7, 8, 9, 10};
    System.out.print("复制前: ");
    for (int i : dest) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println(Arrays.toString(dest));
    System.arraycopy(src, 0, dest, 0, 3);
    System.out.print("复制后: ");
    for (int i : dest) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println(Arrays.toString(dest));
  }

  private static void demo1() {
    long start = System.currentTimeMillis();
    long sum = 0;
    for (int i = 1; i <= 1000000000; ++i) {
      sum += i;
    }
    long end = System.currentTimeMillis();
    System.out.println(sum);
    System.out.println("共耗时(毫秒): " + (end - start));

  }
}
