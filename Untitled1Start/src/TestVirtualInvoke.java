/**
 *
 * @author incipe
 * @date 2020/2/11
 * Email:chao7461@gmail.com
 * The story has just begun !
 */
public class TestVirtualInvoke {
  static void doStuff(Shape s) {
    s.draw();
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    Triangle t = new Triangle();
    Line l = new Line();
    doStuff(c);
    doStuff(t);
    doStuff(l);
  }
}

class Shape {
  void draw() {
    System.out.println("Shape Drawing");
  }
}

class Circle extends Shape {
  @Override
  void draw() {
    System.out.println("Draw Circle");
  }
}

class Triangle extends Shape {
  @Override
  void draw() {
    System.out.println("Draw Triangle");
  }
}

class Line extends Shape {
  @Override
  void draw() {
    System.out.println("Draw three lines");
  }
}

