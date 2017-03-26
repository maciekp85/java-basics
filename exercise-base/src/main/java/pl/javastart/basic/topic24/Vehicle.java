package pl.javastart.basic.topic24;

/**
 * Created by nishi on 2017-03-26.
 */
public abstract class Vehicle {

  private int speed;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }


  public abstract void speedUp();
}
