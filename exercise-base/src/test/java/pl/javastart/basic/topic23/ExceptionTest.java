package pl.javastart.basic.topic23;

import java.util.Scanner;

/**
 * Created by nishi on 2017-03-22.
 */
public class ExceptionTest {

  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner( System.in );
    System.out.println("Enter some number: ");
    number = sc.nextInt();
    System.out.println("You have entered: " + number);
  }
}
