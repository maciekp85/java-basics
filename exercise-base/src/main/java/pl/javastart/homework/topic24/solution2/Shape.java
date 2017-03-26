package pl.javastart.homework.topic24.solution2;

/**
 * Created by nishi on 2017-03-26.
 */
public interface Shape {

  public static final int RECTANGLE = 1;
  public static final int CIRCLE = 2;
  public static final int TRIANGLE = 3;

  public static final double PI = 3.14;

  // methods are public and abstract by default
  public double calculatePerimeter();
  public double calculateArea();
}
