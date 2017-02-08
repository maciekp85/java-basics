package pl.javastart.homework;

/**
 * Created by nishi on 2017-02-08.
 */
public class Calculator {

  public double add(double a, double b) {
    double result = a + b;
    return result;
  }

  public double add(double a, double b, double c) {
    double result = add( a, b );
    return result + c;
  }

  public double subtract(double a, double b) {
    double result = a - b;
    return result;
  }

  public double subtract(double a, double b, double c) {
    double result = subtract( a, b );
    return result - c;
  }

  public double multiply(double a, double b) {
    double result = a * b;
    return result;
  }

  public double divide(double a, double b) {
    double result = a / b;
    return result;
  }
}
