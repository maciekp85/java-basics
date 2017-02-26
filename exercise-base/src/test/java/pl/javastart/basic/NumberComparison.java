package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-26.
 */
public class NumberComparison {

  public static void main(String args[]) {
    int a = 40;
    int b = 20;
    int c = 30;

    if (a > b) {
      if(a > c)
        System.out.println("a is greater than b and c!");
      else
        System.out.println("a is greater than b but less than c");
    } else {
      System.out.println("a is less than b");
    }
  }
}
