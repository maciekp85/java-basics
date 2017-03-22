package pl.javastart.homework.topic22;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-22.
 */
public class Enigma {

  public static void main(String[] args) {

    int words;
    String wordIn, wordOut;
    StringBuilder builder = new StringBuilder(  );

    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    System.out.println("How many words do you want to enter?");
    words = sc.nextInt();
    for (int i =0; i < words; i++) {
      System.out.print("Enter " + (i+1) + " word: ");
      wordIn = sc.next();
      builder.append(wordIn.charAt( wordIn.length() - 1));
    }
    wordOut = builder.toString();
    System.out.println("New word: " + wordOut);
    sc.close();
  }
}
