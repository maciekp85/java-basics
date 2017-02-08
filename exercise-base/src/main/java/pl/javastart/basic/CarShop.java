package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarShop {

  static Car mazda;

  public static void main(String args[]) {
    mazda = new Car();
    mazda.brand = "Mazda";
    mazda.model = "CX-5";
    mazda.doors = 4;
    mazda.carColor = "red";
    mazda.wheelsColor = "silver";
    mazda.tiresColor = "black";

    String mazdaInfo = mazda.brand + " " + mazda.model
                      + ", Door: " + mazda.doors
                      + ", Car color: " + mazda.carColor
                      + ", Wheels color: " + mazda.wheelsColor
                      + ", Tires color: " + mazda.tiresColor;

    System.out.println("You chose following car: ");
    System.out.println(mazdaInfo);
  }
}
