package pl.javastart.homework.topic18;

/**
 * Created by nishi on 2017-03-05.
 */
public class Apple extends Fruit {

  private String kind;

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Apple(String kind) {
    setKind( kind );
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Apple " + getKind());
  }
}
