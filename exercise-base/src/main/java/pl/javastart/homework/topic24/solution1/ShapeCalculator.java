package pl.javastart.homework.topic24.solution1;

import pl.javastart.basic.topic23.NoElementFoundException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-26.
 */
public class ShapeCalculator {

  public static void main(String[] args) throws NoElementFoundException {
    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    boolean error = false;

    while (!error) {
      try {
        System.out.println( "Choose a figure (r - rectangle, c - circle, t - triangle) " );
        String option = sc.nextLine();
        switch (option) {
          case "r": {
            System.out.print( "a = " );
            double a1 = sc.nextDouble();
            System.out.print( "b = " );
            double b1 = sc.nextDouble();
            Shape rectangle = new Rectangle( a1, b1 );
            System.out.println( "Choose a calculation: 1 - calculate a perimeter, 2 - calculate an area" );
            int calcRectangle = sc.nextInt();
            if (calcRectangle == 1) {
              System.out.println( "Rectangle perimeter: " + rectangle.calculatePerimeter() );
            } else if (calcRectangle == 2){
              System.out.println( "Rectangle area: ( a = " + ((Rectangle) rectangle).getA() + ", b = " + ((Rectangle) rectangle).getB() + " )" + rectangle.calculateArea() );
            } else {
              sc.nextLine();
              throw new NoElementFoundException( "No found element" );
            }
            error = true;
            break;
          }
          case "c": {
            System.out.print( "r = " );
            double r = sc.nextDouble();
            Shape circle = new Circle( r );
            System.out.println( "Choose a calculation: 1 - calculate a perimeter, 2 - calculate an area" );
            int calcCircle = sc.nextInt();
            if (calcCircle == 1) {
              System.out.println( "Circle perimeter: " + circle.calculatePerimeter() );
            } else if (calcCircle == 2){
              System.out.println( "Circle area: " + circle.calculateArea() );
            } else {
              sc.nextLine();
              throw new NoElementFoundException( "No found element" );
            }
            error = true;
            break;
          }
          case "t": {
            System.out.print( "a = " );
            double a3 = sc.nextDouble();
            System.out.print( "b = " );
            double b3 = sc.nextDouble();
            System.out.print( "c = " );
            double c3 = sc.nextDouble();
            System.out.print( "h = " );
            double h = sc.nextDouble();
            Shape triangle = new Triangle( a3, b3, c3, h );
            System.out.println( "Choose a calculation: 1 - calculate a perimeter, 2 - calculate an area" );
            int calcTriangle = sc.nextInt();
            if (calcTriangle == 1) {
              triangle.calculatePerimeter();
            } else if (calcTriangle == 2){
              triangle.calculateArea();
            } else {
              sc.nextLine();
              throw new NoElementFoundException( "No found element" );
            }
            error = true;
            break;
          }
          default:
            throw new NoElementFoundException( "No option found" );
        }
      } catch (InputMismatchException e) {
        e.printStackTrace();
        sc.nextLine();
      } catch (NoElementFoundException e) {
        e.printStackTrace();
      }
    }
    sc.close();
  }
}
