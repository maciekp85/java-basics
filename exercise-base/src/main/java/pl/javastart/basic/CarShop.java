package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarShop {

  static CarFactory cf;

  public static void main(String args[]) {
    cf = new CarFactory();

    Car mazda = cf.createCar( "Mazda", "CX-5", 4, "red", "silver", "black" );
    Car bmw = cf.createCar( "BMW", "Z3", 2, "blue", "lightgreen", "black" );

    mazda.printInfo();
    bmw.printInfo();
  }
}
