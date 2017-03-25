package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-23.
 */
public class NumberTest {

  public static void main(String[] args) {
    Numbers2 array2 = new Numbers2();
    try {
      // everything is ok
      array2.get( 2 );
      // wrong index, generated an exception
      array2.add( -2, 100 );
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.err.println( ex.getMessage() );
    }
  }
}
