package pl.javastart.basic.topic22;

/**
 * Created by nishi on 2017-03-21.
 */
public class StringsTest3 {

  public static void main(String[] args) {

    long time1, time2;

    long startTime = System.nanoTime();
    StringBuilder builder = new StringBuilder(  );

    for (int i = 0; i < 1000; i++) {
      builder.append( i );
      builder.append( " " );
    }
    String number = builder.toString();
    time1 = System.nanoTime() - startTime;
    System.out.println("Time1: " + time1);
    System.out.println(number);

    startTime = System.nanoTime();
    String numbers2 = "";
    for (int i=0; i < 1000; i++ ) {
      numbers2 += i + " ";
    }
    time2 = System.nanoTime() - startTime;
    System.out.println("Time2: " + time2);
    System.out.println(numbers2);

    System.out.println("Time2 / Time1: " + time2 / time1);
  }
}
