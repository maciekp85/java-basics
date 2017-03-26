package pl.javastart.homework.topic24.solution2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Created by nishi on 2017-03-26.
 */
public class Main {

  public static void main(String[] args) {
    
    Main main = new Main();

    ShapeCalculator shapeCal = new ShapeCalculator();
    Shape shape = null;

    boolean readComplete = false;
    while (!readComplete) {
      try {
        main.printOptions();
        shape = shapeCal.createShape();
        readComplete = true;
      } catch (InputMismatchException e) {
        System.out.println("You have entered data in wrong format, try again");
      } catch (NoSuchElementException e) {
        System.out.println("Selected shape ID is incorrect ");
      }
    }
    System.out.println(shape);

    shapeCal.closeScanner();
  }

  private void printOptions() {
    System.out.println("Choose a figure to calculate its perimeter and area");
    System.out.println(Shape.RECTANGLE + " - rectangle");
    System.out.println(Shape.CIRCLE + " - circle");
    System.out.println(Shape.TRIANGLE + " - triangle");
  }
}
