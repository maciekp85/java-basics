package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-23.
 */
public class NumberWithIntTypeException1Test {

  public static void main(String[] args) {
    Numbers array1 = new Numbers();
    // Everything is ok
    array1.add( 9, 1 );
    // wrong index, generated an exception
    array1.get( -2);
  }
}
