package pl.javastart.basic.topic24;

import pl.javastart.basic.topic24.interfaces.Boat;
import pl.javastart.basic.topic24.interfaces.Car;

/**
 * Created by nishi on 2017-03-26.
 */
public class Amphibia implements Car, Boat {

  @Override
  public void printName() {
    System.out.println("Amphibia");
    System.out.println(" is a little ");
    Car.super.printName();
    System.out.println(" and a little ");
    Boat.super.printName();
  }
}
