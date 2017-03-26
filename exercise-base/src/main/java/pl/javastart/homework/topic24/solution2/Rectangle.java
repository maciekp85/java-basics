package pl.javastart.homework.topic24.solution2;

/**
 * Created by nishi on 2017-03-26.
 */
public class Rectangle implements Shape {

  private double a;
  private double b;

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

  public Rectangle(double a, double b) {
    setA( a );
    setB( b );
  }

  @Override
  public double calculatePerimeter() {
    return 2*a + 2*b;
  }

  @Override
  public double calculateArea() {
    return a * b;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append( "Rectangle{" );
    builder.append( "a=" + a + ", ");
    builder.append( "b=" + b + ", ");
    builder.append( "area= " + calculateArea() + ", " );
    builder.append( "perimeter= " + calculatePerimeter() );
    builder.append( '}' );
    return builder.toString();
  }
}
