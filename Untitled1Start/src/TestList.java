import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/2/13 22:16
 * since: 1.0.0
 */
public class TestList {
  public static void main(String[] args) {
    List<Photo> album = new LinkedList<>();
    album.add(new Photo("one", new Date(), "classroom"));
    album.add(new Photo("two", new Date(), "library"));
    album.add(new Photo("three", new Date(), "gym"));
    album.add(new Photo("four", new Date(), "door"));

    Iterator<Photo> iterator = album.iterator();
    while(iterator.hasNext()) {
      Photo photo = iterator.next();
      System.out.println(photo.toString());
    }

    for (Photo photo : album) {
      System.out.println(photo);
    }
  }
}

class Photo {
  String title;
  Date date;
  String memo;

  Photo(String title, Date date, String memo) {
    this.title = title;
    this.date = date;
    this.memo = memo;
  }

  @Override
  public String toString() {
    return title + "(" + date + ")" + memo;
  }
}
