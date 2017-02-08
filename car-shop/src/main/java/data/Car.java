package data;

/**
 * Created by nishi on 2017-02-08.
 */
// Class can be public or default
// It can not be protected along with private
public class Car {

  // VARIABLES
  private int doors;
  private String color;
  private String wheels;
  private String tires;
  private String brand;
  private String model;
  private int year;

  // SETTERS AND GETTERS
  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getWheels() {
    return wheels;
  }

  public void setWheels(String wheels) {
    this.wheels = wheels;
  }

  public String getTires() {
    return tires;
  }

  public void setTires(String tires) {
    this.tires = tires;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    // We set new value of year if it is greater than 0
    if (year > 0) {
      this.year = year;
    } else {
      System.out.println("Year must be greater than 0!");
    }
  }

  // CONSTRUCTORS
  // Constructor 1
  public Car(Car carToCopy) {

    // Here we call constructor 2 which sets us a car brand, car model, doors number, wheels and tires color
    this(carToCopy.getBrand(), carToCopy.getModel(), carToCopy.getDoors(), carToCopy.getColor(), carToCopy.getWheels(), carToCopy.getTires(), carToCopy.getYear());
  }

  // Constructor 2
  public Car(String brand, String model, int doors, String color, String wheels, String tires, int year) {
    this.setBrand( brand );
    this.setModel( model );
    this.setDoors( doors );
    this.setColor( color );
    this.setWheels( wheels );
    this.setTires( tires );
    this.setYear( year );
  }

  public void printInfo() {
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
