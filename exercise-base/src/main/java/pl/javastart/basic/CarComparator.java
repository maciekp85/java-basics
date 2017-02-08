package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarComparator {

  public static void main(String args[]) {
    Car mazda = new Car();
    mazda.brand = "Mazda";
    mazda.model = "CX-5";
    mazda.doors = 4;
    mazda.carColor = "red";
    mazda.wheelsColor = "silver";
    mazda.tiresColor = "black";

    // Is mazda a car?
    boolean isCar = mazda instanceof Car;
    System.out.println(isCar);
  }
}
