package pl.javastart.basic.topic16;

/**
 * Created by nishi on 2017-03-04.
 */
public class Human {

  private String name;
  private double height;
  public static double avgHeight;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Human(String name, double height) {
    this.setName( name );
    this.setHeight( height );
  }
}
