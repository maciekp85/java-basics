package pl.javastart.basic.topic24;

/**
 * Created by nishi on 2017-03-26.
 */
public class Car extends Vehicle {

  @Override
  public void speedUp() {
    setSpeed( getSpeed() + 5 );
  }
}
