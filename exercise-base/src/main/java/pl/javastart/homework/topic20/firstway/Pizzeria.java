package pl.javastart.homework.topic20.firstway;

import pl.javastart.homework.topic20.firstway.Pizza;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-08.
 */
public class Pizzeria {

  public static void main(String[] args) {
    System.out.println("Available pizzas: ");

    int i = 1;
    for (Pizza p: Pizza.values()) {
      System.out.println((i++) + ". " + p.name() + p);
    }

    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    System.out.println("\nWhich pizza do you want to choose? (1, 2 or 3): ");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("You have chosen " + Pizza.MARGHERITA.name() + Pizza.MARGHERITA);
        break;
      case 2:
        System.out.println("You have chosen " + Pizza.CAPRICIOSA.name() + Pizza.CAPRICIOSA);
        break;
      case 3:
        System.out.println("You have chosen " + Pizza.PROSCIUTTO.name() + Pizza.PROSCIUTTO);
        break;
      default:
        System.out.println("You have not chosen anything");
    }

    sc.close();

  }
}
