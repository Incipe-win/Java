import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/14 21:44
 * since: 1.0.0
 */
public class TestCollectionSort {
  public static void main(String[] args) {
    List<Person1> school = new ArrayList<Person1>();
    school.add(new Person1("yangx", 24));
    school.add(new Person1("zhangx", 19));
    school.add(new Person1("Li", 21));
    school.add(new Person1("Zheng", 22));
    school.add(new Person1("Zhao", 22));
    System.out.println(school);
    /** Lambda
     Collections.sort(school, (p1,p2) -> p1.age - p2.age);
     System.out.println(school);

     //二分法查找
     //int index = Collections.binarySearch(
     //school, new Person2("Li", 21), new PersonComparator2());
     int index = Collections.binarySearch(
     school, new Person2("Li", 21), (p1, p2) -> p1.age - p2.age);
     */
    Collections.sort(school, new PersonComparator());
    System.out.println(school);

    int index = Collections.binarySearch(school, new Person1("Li", 21), new PersonComparator());
    if (index >= 0) {
      System.out.println("Found: " + school.get(index));
    } else {
      System.out.println("Not Found!");
    }
  }
}

class Person1 {
  String name;
  int age;

  public Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}

class PersonComparator implements Comparator {
  @Override
  public int compare(Object obj1, Object obj2) {
    Person1 p1 = (Person1) obj1;
    Person1 p2 = (Person1) obj2;

    if (p1.age > p2.age) {
      return 1;
    } else if (p1.age < p2.age) {
      return -1;
    }
    return p1.name.compareTo(p2.name);
  }
}