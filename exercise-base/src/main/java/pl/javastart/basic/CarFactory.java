package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class CarFactory {

  Car createCar(String carBrand, String carModel, int doorsNumber, String color, String wheels, String tires) {

    // We create new object of Car type
    Car car = new Car();

    // We assign parameters that we passed as method parameters
    car.brand = carBrand;
    car.model = carModel;
    car.doors = doorsNumber;
    car.carColor = color;
    car.wheelsColor = wheels;
    car.tiresColor = tires;

    // We return created instance of Car class
    return car;
  }
}
