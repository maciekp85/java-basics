package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-07.
 */
public class Concatenation {

  public static void main(String args[]) {

    String s1 = "Hello";
    String s2 = " World!";
    String s3 = s1 + s2;

    System.out.println(s3);

    // You can use concatenation directly in print()
    System.out.println("I learn Java from " + 2 + "days");

    // You can also concatenate other types
    System.out.println("Kate is a beautiful. It is " + true);

    // String inscription = 2 + 3;  // wrong
  }
}
