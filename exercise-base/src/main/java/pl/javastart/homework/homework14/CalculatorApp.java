package pl.javastart.homework.homework14;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-02-28.
 */
public class CalculatorApp {

  public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    input.useLocale( Locale.US );

    double firstnumber;
    double secondnumber;
    final String operator;

    System.out.println("Enter first number: ");
    firstnumber = input.nextDouble();
    input.nextLine();
    System.out.println("Enter operator (required +, -, *, /): ");
    operator = input.nextLine();
    System.out.println("Enter second number: ");
    secondnumber = input.nextDouble();

    Calculator calc = new Calculator();
    System.out.println("Result: " + calc.calculate(firstnumber, secondnumber, operator ));

    input.close();
  }
}
