package pl.javastart.basic.topic15;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-01.
 */
public class ForEachProblem {

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    int[] tab = new int[3];

    for (int tmp: tab) {
      System.out.println("Enter number: ");
      tmp = sc.nextInt();
    }

    for (int tmp: tab) {
      System.out.println(tmp);
    }

    sc.close();
  }
}
