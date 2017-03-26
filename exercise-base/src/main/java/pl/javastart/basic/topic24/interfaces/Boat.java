package pl.javastart.basic.topic24.interfaces;

/**
 * Created by nishi on 2017-03-26.
 */
public interface Boat {

  public default void printName() {
    System.out.println("Boat");
  }
}
