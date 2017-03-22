package pl.javastart.basic.topic22;

/**
 * Created by nishi on 2017-03-21.
 */
public class StringsTest2 {

  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder(  );

    for (int i = 0; i < 1000; i++) {
      builder.append( i );
      builder.append( " " );
    }
    String numbers = builder.toString();
    System.out.println(numbers);
  }
}
