package pl.javastart.basic.topic23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-22.
 */
public class TryCatch2Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    int number = 0;
    boolean error = true;

    while (error) {
      try {
        System.out.println("Enter some number: ");
        number = sc.nextInt();
        error = false;
      } catch (InputMismatchException ex) {
        System.err.println( "Entered value is not integer number. Try again:" );
        sc.nextLine();
      }
    }

    System.out.println("You have entered: " + number);
    sc.close();
  }
}
