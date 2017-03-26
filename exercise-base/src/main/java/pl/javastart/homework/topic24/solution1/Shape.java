package pl.javastart.homework.topic24.solution1;

/**
 * Created by nishi on 2017-03-26.
 */
public interface Shape {

  public static final double PI = 3.14;

  default public int speedUp(int speed) {
    return speed++;
  }

  // methods are public and abstract by default
  public double calculatePerimeter();
  public double calculateArea();
}
