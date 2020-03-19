/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/25 22:22
 * since: 1.0.0
 */
public class ArrayReverse {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      //交换两个数
      arr[low] = arr[low] + arr[high];
      arr[high] = arr[low] - arr[high];
      arr[low] = arr[low] - arr[high];
      low++;
      high--;
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
