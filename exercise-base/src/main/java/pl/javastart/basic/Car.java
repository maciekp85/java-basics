package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class Car {
  int doors;
  String color;
  String wheels;
  String tires;
  String brand;
  String model;

  // Constructor 1
  Car(String brand, String model, int doors, String color, String wheels, String tires) {

    // Here we call constructor 2 which sets us a car brand, car model, doors number, wheels and tires color
    this(brand, model, doors, wheels, tires);

    // Additionally we set also color car color
    this.color = color;
  }

  // Constructor 2
  Car(String brand, String model, int doors, String wheels, String tires) {
    this.brand = brand;
    this.model = model;
    this.doors = doors;
    this.wheels = wheels;
    this.tires = tires;
  }

  void printInfo() {
    String info = "";
    info = info + brand + " ";
    info = info + model + ", ";
    info = info + "color: " + color + ", ";
    info = info + "doors: " + doors + ", ";
    info = info + "wheels color: " + wheels + " ";
    info = info + "tires color: " + tires;

    System.out.println(info);
  }
}
