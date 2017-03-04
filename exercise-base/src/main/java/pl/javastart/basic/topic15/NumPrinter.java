package pl.javastart.basic.topic15;

/**
 * Created by nishi on 2017-03-01.
 */
public class NumPrinter {

  public static void main(String[] args) {
    for(int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("First loop: " + i);
    }

    for(int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("Second loop: " + i);
    }

    int i = 1;
    while (i <= 5) {
      System.out.println("Number " + i);
      i++;
    }
  }
}
