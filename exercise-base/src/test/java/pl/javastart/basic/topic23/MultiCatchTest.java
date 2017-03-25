package pl.javastart.basic.topic23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-22.
 */
public class MultiCatchTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    int[] numbers = new int[2];
    boolean error = true;

    while (error) {
      try {
        System.out.println("Enter first number: ");
        numbers[0] = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number: ");
        numbers[1] = sc.nextInt();
        sc.nextLine();

        System.out.println("Choose a value: 1 or 2");
        System.out.println("Value: " + numbers[sc.nextInt() - 1]);
        error = false;
      } catch (InputMismatchException ex) {
        System.err.println( "You have not chosen an integer number. Let's start from the beginning:" );
        sc.nextLine();
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.err.println( "It should be the value 1 or 2. Let's start from the beginning:" );
        sc.nextLine();
      }
    }
    sc.close();
  }
}
