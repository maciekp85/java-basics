package pl.javastart.basic.topic15;

/**
 * Created by nishi on 2017-03-01.
 */
public class NumPrinter2 {

  public static void main(String[] args) {
    int i = 5;

    do {
      System.out.println("Number " + i);
    } while (i < 3);


    // Exercise checking
    int number = 0;

    while(number < 10) {
      if(number % 2 == 0) {
        number++;
        continue;
      } else if (number % 5 == 0) {
        break;
      }
      System.out.print(number+" ");
      number++;
    }
  }
}
