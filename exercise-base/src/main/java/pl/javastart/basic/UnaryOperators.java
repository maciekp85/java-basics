package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-07.
 */
public class UnaryOperators {

  public static void main(String args[]) {

    int num = 3;
    // first print, than increase
    System.out.println(num++);
    System.out.println(num);

    // first increase, than print
    System.out.println(++num);
    System.out.println(num);

  }
}
