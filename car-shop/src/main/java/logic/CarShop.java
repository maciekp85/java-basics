package logic;

import data.Car;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarShop {

  public static void main(String args[]) {
    Car mazda = new Car( "Mazda", "CX-5", 4, "red", "silver", "black", 2012 );
    System.out.println("Year: " + mazda.getYear()); // 2012
    // we change a year
    mazda.setYear( 2015 );
    System.out.println("Year: " + mazda.getYear()); // 2015
    // We try to change again
    mazda.setYear( -500 );  // statement in console
    System.out.println("Year: " + mazda.getYear()); // 2015

    Car bmw = new Car( "BMW", "Z3", 2, "blue", "lightgreen", "black", 2005 );


    mazda.printInfo();
    bmw.printInfo();
  }
}
