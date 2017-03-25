package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-23.
 */
public class NumberWithStringTypeException1Test {

  public static void main(String[] args) {
    Numbers2 array2 = new Numbers2();
    // Everything is ok
    array2.add( 9, 1 );
    // wrong index, generated an exception
    array2.get( -2);
  }
}
