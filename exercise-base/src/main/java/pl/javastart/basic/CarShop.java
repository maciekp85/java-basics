package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarShop {

  public static void main(String args[]) {
    Car mazda = new Car( "Mazda", "CX-5", 4, "red", "silver", "black" );
    Car bmw = new Car( "BMW", "Z3", 2, "blue", "lightgreen", "black" );

    mazda.printInfo();
    bmw.printInfo();
  }
}
