package pl.javastart.homework;

import java.util.Random;

/**
 * Created by nishi on 2017-02-07.
 */
public class OperatorsHomework {

  public static void main(String args[]) {

    Random rand = new Random();
    int x;
    int y;
    boolean result;

    x = rand.nextInt(100); // random number from range [0, 99], 100 is not included
    y = new Random().nextInt(100); // short version

    System.out.println("x = " + x);
    System.out.println("y = " + y);

    result = x > y;
    System.out.println("x > y : " + result);

    result = (x * 2) > y;
    System.out.println("(x * 2) > y : " + result);

    result = y < (x + 3) && y > (x - 2);
    System.out.println("y < (x + 3) && y > (x - 2) : " + result);

    result = (x * y) % 2 == 0;
    System.out.println("(x * y) % 2 == 0 : " + result);
  }
}
