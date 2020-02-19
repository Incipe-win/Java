/**
 *
 * @author incipe
 * @date 2020/2/12
 * Email:chao7461@gmail.com
 * The story has just begun !
 */
public class TestInnerClass {
  public static void main(String[] args) {
    Parcel p = new Parcel();

    Parcel.Contents c = new Parcel.Contents(33);
    Parcel.Destination d = new Parcel.Destination("y");
  }
}

class Parcel {
  private Contents c;
  private Destination d;

  static class Contents {
    private int i;
    Contents(int i) {
      this.i = i;
      System.out.println(value());
    }
    int value() {
      //System.out.println("Hello World!");
      return i;
    }
  }

  static class Destination {
    private String label;
    Destination(String whereTo) {
      label = whereTo;
      System.out.println(label);
    }
  }
}
