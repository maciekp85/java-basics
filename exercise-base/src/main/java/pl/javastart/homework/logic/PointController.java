package pl.javastart.homework.logic;

import pl.javastart.homework.data.Point;

/**
 * Created by nishi on 2017-02-08.
 */
public class PointController {

  public void addX(Point p) {
    p.setX( p.getX() + 1 );
  }

  public void minusX(Point p) {
    p.setX( p.getX() - 1 );
  }

  public void addY(Point p) {
    p.setY( p.getY() + 1 );
  }

  public void minusY(Point p) {
    p.setY( p.getY() - 1 );
  }

  public void changeObject(Point p) {
    p = new Point( -100, -100 );
  }
}
