package pl.javastart.basic.topic14;

import java.util.Scanner;

/**
 * Created by nishi on 2017-02-28.
 */
public class InOut {

  public static void main(String[] args) {
    Scanner input = new Scanner( System.in );

    String firstname;
    String lastname;
    int age;

    System.out.println("Enter your first name: ");
    firstname = input.nextLine();
    System.out.println("Enter your last name: ");
    lastname = input.nextLine();
    System.out.println("Enter your age: ");
    age = input.nextInt();

    input.close();

    System.out.println("Hello " + firstname + " " + lastname + ". You are " + age + " years old.");
  }
}
