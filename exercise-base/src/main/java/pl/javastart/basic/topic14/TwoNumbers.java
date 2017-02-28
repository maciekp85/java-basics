package pl.javastart.basic.topic14;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-02-28.
 */
public class TwoNumbers {

  public static void main(String[] args) {

    Scanner input = new Scanner( System.in );
    input.useLocale( Locale.US );

    double first;
    double second;

    System.out.println("Enter first double number: ");
    first = input.nextDouble();
    System.out.println("Enter second double number: ");
    second = input.nextDouble();

    input.close();

    System.out.println("First + Second number: " + (first + second));
  }
}
