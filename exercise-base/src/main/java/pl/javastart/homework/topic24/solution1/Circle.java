package pl.javastart.homework.topic24.solution1;

/**
 * Created by nishi on 2017-03-26.
 */
public class Circle implements Shape {

  private double r;

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  public Circle(double r) {
    setR( r );
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Shape.PI * r;
  }

  @Override
  public double calculateArea() {
    return Shape.PI * r * r;
  }
}
