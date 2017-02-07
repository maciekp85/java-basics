package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-07.
 */
public class Conversions {

  public static void main(String args[]) {

    double number1 = 10.987;
    int number2 = 5;

    // narrowing conversion
    int narrowing = (int) number1;

    // widening conversion
    double widening = (double) number2;

    System.out.println("Narrowing: " + narrowing);
    System.out.println("Widening: " + widening);
  }
}
