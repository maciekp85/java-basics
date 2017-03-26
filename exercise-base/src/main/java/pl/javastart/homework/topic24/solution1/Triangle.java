package pl.javastart.homework.topic24.solution1;

/**
 * Created by nishi on 2017-03-26.
 */
public class Triangle implements Shape {

  private double a;
  private double b;
  private double c;
  private double h;

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getH() {
    return h;
  }

  public void setH(double h) {
    this.h = h;
  }

  public Triangle(double a, double b, double c, double h) {
    setA( a );
    setB( b );
    setC( c );
    setH( h );
  }

  @Override
  public double calculatePerimeter() {
    return 0.5 * a * h;
  }

  @Override
  public double calculateArea() {
    return a + b + c;
  }
}
