package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-26.
 */
public class HelloName {

  public static void main(String args[]) {
    final String krzysiek = "Krzysiek";
    final String maciek = "Maciek";
    final String maciek2 = "Maciek";

    String name = maciek2;

    switch (name) {
      case krzysiek:
        System.out.println("Hi " + krzysiek + "! Nice to meet you.");
        break;
      case maciek: maciek2:
        System.out.println("Welcome to Poland " + maciek);
        break;
      default:
        System.out.println("Welcome unknown person");
    }
  }
}
