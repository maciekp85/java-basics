package pl.javastart.basic.topic14;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-02-28.
 */
public class Temp {

  public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    input.useLocale( Locale.US );

    double number;
    String text1;
    String text2;

    System.out.println("Enter some number:");
    number = input.nextDouble();
    input.nextLine();
    System.out.println("Enter first text:");
    text1 = input.nextLine();
    System.out.println("Enter second text:");
    text2 = input.nextLine();

    input.close();

    System.out.println("Number: " + number);
    System.out.println("Text1: " + text1 );
    System.out.println("Text2: " + text2 );
  }
}
