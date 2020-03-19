/**
 * Description: The story has just begun!
 *
 * @author incipe
 * create: 2020/3/15 22:45
 * since: 1.0.0
 */
public class PhraseOMatic {
  public static void main(String[] args) {
    String[] wordListOne = {"24 / 7", "multi-Tier", "30000 foot", "B-to-B", "win-win", "front-end",
      "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

    String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
      "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
      "targeted", "shared", "cooperative", "accelerated"};

    String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
      "strategy", "mind-share", "portal", "space", "vision", "paradigm", "mission"};

    int onLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = (int) (Math.random() * onLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    String phrase = wordListOne[rand1] + wordListTwo[rand2] + wordListThree[rand3];

    System.out.println("What we need is a " + phrase);
  }
}
