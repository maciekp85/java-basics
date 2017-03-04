package pl.javastart.basic.topic16;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-04.
 */
public class PrintNumbers {

  public static final int EXIT = 0;

  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    do {
      System.out.println("Enter first number: ");
      int start = sc.nextInt();
      System.out.println("Enter second number: ");
      int end = sc.nextInt();
      printNumbers(start, end);

      System.out.println("End of program - enter 0");
      System.out.println("Continue - enter 1");
    } while (sc.nextInt() != EXIT);
  }

  private static void printNumbers(int start, int end) {
    for (int i = start; i <= end; i++) {
      System.out.println(i + " ");
    }
    System.out.println();
  }
}
