package pl.javastart.homework.topic23;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-25.
 */
public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );
    Calculate calc = new Calculate();

    while (!calc.isExit()) {
      try {
        System.out.println("Enter first number: ");
        double number1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter second number: ");
        double number2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Calculate (operation): +, -, /, *, exit");
        String operation = sc.nextLine();
        double result = calc.calculate(operation, number1, number2);
        if (!calc.isExit()) System.out.println(result);
      } catch (InputMismatchException e) {
        System.err.println( "The next token does not match the double" );
        e.printStackTrace();
        sc.nextLine();
      } catch (ArithmeticException | UnknownOperatorException e) {
        System.err.println( e.getMessage() );
        e.printStackTrace();
      }
    }
    sc.close();
  }
}
