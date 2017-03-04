package pl.javastart.basic.topic15;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-01.
 */
public class NumberChecker {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    int number;
    for (int i = 0; i < 3; i++) {
      System.out.println("Enter number " + i + ": ");
      number = sc.nextInt();
      if (number % 2 == 0)
        System.out.println("Number " + number + " is even");
      else
        System.out.println("Number " + number + " is odd");
    }

    sc.close();
  }
}
