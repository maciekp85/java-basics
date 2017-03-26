package pl.javastart.homework.topic24.solution2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-26.
 */
public class ShapeCalculator {

    private Scanner sc;

    public ShapeCalculator() {
      sc = new Scanner( System.in );
      sc.useLocale( Locale.US );
    }

    public void closeScanner() {
      sc.close();
    }

    public Rectangle readRectangleData() throws InputMismatchException {
      System.out.println("Please specify information about rectangle");
      System.out.print( "a = " );
      double a = 0;
      double b = 0;
      try {
        a = sc.nextDouble();
        sc.nextLine();
        System.out.print( "b = " );
        b = sc.nextDouble();
        sc.nextLine();
      } catch (InputMismatchException e) {
        sc.nextLine();
        throw e;
      }

      return new Rectangle( a, b );
    }


  public Circle readCircleData() throws InputMismatchException {
    System.out.println("Please specify information about circle");
    System.out.print( "r = " );
    double r = 0;
    try {
      r = sc.nextDouble();
      sc.nextLine();
    } catch (InputMismatchException e) {
      sc.nextLine();
      throw e;
    }

    return new Circle( r );
  }

  public Triangle readTriangleData() throws InputMismatchException {
    System.out.println("Please specify information about triangle");
    System.out.print( "a = " );
    double a = 0;
    double b = 0;
    double c = 0;
    double h = 0;
    try {
      a = sc.nextDouble();
      sc.nextLine();
      System.out.print( "b = " );
      b = sc.nextDouble();
      sc.nextLine();
      System.out.print( "c = " );
      c = sc.nextDouble();
      sc.nextLine();
      System.out.print( "h = " );
      h = sc.nextDouble();
      sc.nextLine();
    } catch (InputMismatchException e) {
      sc.nextLine();
      throw e;
    }

    return new Triangle( a, b, c, h );
  }

  public Shape createShape() throws NoSuchElementException, InputMismatchException {
      try {
       int shapeType = sc.nextInt();
       sc.nextLine();
       switch (shapeType) {
         case Shape.RECTANGLE:
           return readRectangleData();
         case Shape.CIRCLE:
           return readCircleData();
         case Shape.TRIANGLE:
           return readTriangleData();
         default:
           throw new NoSuchElementException( );
       }
      } catch (InputMismatchException e) {
        sc.nextLine();
        throw e;
      }
  }
}
