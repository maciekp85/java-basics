package pl.javastart.homework.PointApplication;

import pl.javastart.homework.data.Point;
import pl.javastart.homework.logic.PointController;

/**
 * Created by nishi on 2017-02-08.
 */
public class PointTest {

  private static final int ADD_X = 1;
  private static final int ADD_Y = 2;
  private static final int MIN_X = 3;
  private static final int MIN_Y = 4;

  public static void main(String args[]) {
    Point p1 = new Point( 4, 5 );
    PointController pointControl = new PointController();
    System.out.println("Point coordinates ( x = " + p1.getX() + ", y = " + p1.getY() + " )\n");

    System.out.println("After executed addX() method, adding number one to x coordinate");
    pointControl.addX( p1 );
    System.out.println("Point coordinates ( x = " + p1.getX() + ", y = " + p1.getY() + " )\n");

    System.out.println("After executed minusX() method, subtracting number one from x coordinate");
    pointControl.minusX( p1 );
    System.out.println("Point coordinates ( x = " + p1.getX() + ", y = " + p1.getY() + " )\n");

    System.out.println("After executed addY() method, adding number one to y coordinate");
    pointControl.addY( p1 );
    System.out.println("Point coordinates ( x = " + p1.getX() + ", y = " + p1.getY() + " )\n");

    System.out.println("After executed minusY() method, subtracting number one from y coordinate");
    pointControl.minusY( p1 );
    System.out.println("Point coordinates ( x = " + p1.getX() + ", y = " + p1.getY() + " )\n");

    pointControl.changeObject( p1 );
    System.out.println("After executed changeObject() method to create and assign new object to p1 reference");
    System.out.println("Point coordinates ( x = " + p1.getX() + ", y = " + p1.getY() + " )\n");

    // 11. Homework - control flow statements
    System.out.println("11. Homework - control flow statements");
    Point p2 = new Point( 10,20 );
    System.out.println("Options: ");
    System.out.println("1 - ADD_X");
    System.out.println("2 - ADD_Y");
    System.out.println("3 - MIN_X");
    System.out.println("4 - MIN_Y");
    final int option = 5;

    System.out.println("Before changes: P2( x = " + p2.getX() + " , y = " + p2.getY() + " )");

    switch (option) {
      case ADD_X:
        System.out.println("Have chosen " + ADD_X + " option");
        pointControl.addX( p2 );
        break;
      case ADD_Y:
        System.out.println("Have chosen " + ADD_Y + " option");
        pointControl.addY(p2);
        break;
      case MIN_X:
        System.out.println("Have chosen " + MIN_X + " option");
        pointControl.minusX(p2);
        break;
      case MIN_Y:
        System.out.println("Have chosen " + MIN_Y + " option");
        pointControl.minusY(p2);
        break;
      default:
        System.out.println("Have chosen " + option + " option");
        System.out.println("You have entered wrong value of option! ( 1 - ADD_X, 2 - ADD_Y, 3 - MIN_X, 4 - MIN_Y )");
    }

    System.out.println("After changes: P2( x = " + p2.getX() + " , y = " + p2.getY() + " )");
  }
}
