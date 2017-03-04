package pl.javastart.basic.topic15;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-01.
 */
public class GuessGame {

  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    int number = 500;
    int userInput;

    System.out.println("Guess a number!");
    while ((userInput = sc.nextInt()) != number) {
      if (userInput < number)
        System.out.println("Entered number is less than searched number");
      else
        System.out.println("Entered number is greater than searched number");
    }

    sc.close();
    System.out.println("Yes! You guessed searched number = " + number);
  }
}
