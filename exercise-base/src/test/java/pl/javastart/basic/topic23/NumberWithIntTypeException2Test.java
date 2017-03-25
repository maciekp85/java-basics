package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-23.
 */
public class NumberWithIntTypeException2Test {

  public static void main(String[] args) {
    Numbers array1 = new Numbers();
    // wrong index, generated an exception
    array1.add( 100, 1 );
    // Everything is ok
    array1.get(2);
  }
}
