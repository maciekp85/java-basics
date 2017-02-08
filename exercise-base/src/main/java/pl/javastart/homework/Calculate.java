package pl.javastart.homework;

/**
 * Created by nishi on 2017-02-08.
 */
public class Calculate {

  public static void main(String args[]) {
    Calculator calc = new Calculator();

    int a = 5;
    double b = 8.0;

    System.out.println("a = " + a + ", b = " + b);

    double addResult = calc.add( a, b );
    System.out.println("a + b = " + addResult);

    double subtractResult = calc.subtract( a, b );
    System.out.println("a - b = " + subtractResult);

    double multiplyResult = calc.multiply( a, b );
    System.out.println("a * b = " + multiplyResult);

    double divideResult = calc.divide( a, b );
    System.out.println("a / b = " + divideResult);

  }
}
