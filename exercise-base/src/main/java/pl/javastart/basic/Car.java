package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class Car {
  int doors;
  String carColor;
  String wheelsColor;
  String tiresColor;
  String brand;
  String model;

  void printInfo() {
    String info = "";
    info = info + brand + " ";
    info = info + model + ", ";
    info = info + "color: " + carColor + ", ";
    info = info + "doors: " + doors + ", ";
    info = info + "wheels color: " + wheelsColor + " ";
    info = info + "tires color: " + tiresColor;

    System.out.println(info);
  }
}
