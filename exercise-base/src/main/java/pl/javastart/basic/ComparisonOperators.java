package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-07.
 */
public class ComparisonOperators {

  public static void main(String args[]) {

    int x = 5;
    int y = 10;
    System.out.print("Is X greater than Y? ");
    System.out.println(x > y);

    System.out.print("Is not X equal to Y? ");
    System.out.println(x != y);

    boolean instance = "Kate" instanceof java.lang.String;
    System.out.println(instance); // Kate is an instance of String class
  }
}
