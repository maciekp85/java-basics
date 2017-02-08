package pl.javastart.basic;

import pl.javastart.homework.Calculator;

/**
 * Created by nishi on 2017-02-08.
 */
public class CalcTest {

  public static void main(String args[]) {
    Calc calc = new Calc();
    double addResult = calc.add( 2.5, 7.5 );
    System.out.println(addResult);

    calc.addAndPrint( 6, 8 );

    // 7. Overloading methods test (Homework)
    Calculator calc2 = new Calculator();

    double a = 2.5;
    double b = 7.5;
    double c = 2.0;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    double addTwoNumbersResult = calc2.add( a, b );
    double addThreeNumbersResult = calc2.add( a, b, c );
    System.out.println("a + b = " + addTwoNumbersResult);
    System.out.println("a + b + c = " + addThreeNumbersResult);

    double subtractTwoNumbersResult = calc2.subtract( a, b );
    double subtractThreeNumbersResult = calc2.subtract( a, b, c );
    System.out.println("a - b = " + subtractTwoNumbersResult);
    System.out.println("a - b - c = " + subtractThreeNumbersResult);

  }

}
