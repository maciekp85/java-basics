package pl.javastart.basic.topic22;

/**
 * Created by nishi on 2017-03-13.
 */
public class StringsTest {

  public static void main(String[] args) {
    String s1 = "Ania";
    String s2 = "Ania";

    System.out.println("s1 == s2 : " + (s1 == s2));
    System.out.println("s1.equals(s2): " + s1.equals( s2 ));

    String s3 = new String("Ania");
    String s4 = new String( "Ania" );

    System.out.println("s3 == s4 : " + (s3 == s4));
    System.out.println("s3.equals(s4): " + s3.equals( s4 ));
  }
}
