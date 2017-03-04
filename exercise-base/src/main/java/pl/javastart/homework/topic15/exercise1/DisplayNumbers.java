package pl.javastart.homework.topic15.exercise1;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-04.
 */
public class DisplayNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    int result = 0;

    System.out.println("How many numbers do you want to enter?: ");
    for (int i = sc.nextInt(); i > 0; i--) {
      System.out.print("Enter number: ");
      result += sc.nextInt();
    }

    sc.close();

    System.out.println("Sum for given numbers is: " + result);
  }
}
