package logic;

import data.Car;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarComparator {

  public static void main(String args[]) {
    Car mazda = new Car("Mazda", "CX-5", 4, "red", "silver", "black", 2007);

    // Is mazda a car?
    boolean isCar = mazda instanceof Car;
    System.out.println(isCar);
  }
}
