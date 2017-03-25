package pl.javastart.basic.topic23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-22.
 */
public class TryCatch1Test {

  public static void main(String[] args) {
    int number = 0;
    Scanner sc = new Scanner( System.in );
    System.out.println("Enter some number: ");
    try {
      number = sc.nextInt();
    } catch (InputMismatchException ex) {
      System.err.println( "Entered value is not integer number" );
      ex.printStackTrace();
    }
    System.out.println("You have entered: " + number);
    sc.close();
  }
}
