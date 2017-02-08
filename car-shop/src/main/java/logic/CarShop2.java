package logic;

import data.Car;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarShop2 {

  static Car porshe;

  public static void main(String args[]) {
    System.out.println("Here programme still works");
    System.out.println( porshe.getBrand() );
    System.out.println("This statement won't already print, because programme has not already worked");
  }
}
