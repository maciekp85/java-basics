package pl.javastart.homework.PointApplication;

import pl.javastart.homework.data.Point;
import pl.javastart.homework.logic.PointController;

/**
 * Created by nishi on 2017-02-08.
 */
public class PointTest {

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

  }
}
