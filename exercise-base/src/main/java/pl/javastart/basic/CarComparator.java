package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarComparator {

  public static void main(String args[]) {
    Car mazda = new Car("Mazda", "CX-5", 4, "red", "silver", "black");

    // Is mazda a car?
    boolean isCar = mazda instanceof Car;
    System.out.println(isCar);
  }
}
