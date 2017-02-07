package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-07.
 */
public class Variables {
  public static void main(String args[]) {

    String firstName = "Jan";
    String lastName = "Kowalski";
    int age = 25;
    double height = 179.5;
    final String pesel = "123123123123";

    System.out.print("Hello ");
    System.out.print(firstName);
    System.out.print(" ");
    System.out.println(lastName);

    System.out.println("Below is a few information about you:");
    System.out.print("Your pesel is: ");
    System.out.println(pesel);
    System.out.print("You are ");
    System.out.print(age);
    System.out.println(" years old");

    System.out.print("Your height is: ");
    System.out.print(height);
    System.out.println(" cm");
  }
}
