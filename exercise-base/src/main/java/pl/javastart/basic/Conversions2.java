package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-07.
 */
public class Conversions2 {

  public static void main(String args[]) {

    char letter1 = 'c';
    char letter2 = 'a';
    char letter3 = 't';

    System.out.println("Wrong \"addition\" of letters");
    System.out.println(letter1 + letter2 + letter3);
    System.out.println("Plain text");
    System.out.println("" + letter1 + letter2 + letter3);
    letter1++;
    letter2++;
    letter3++;
    System.out.println("Encrypted text");
    System.out.println("" + letter1 + letter2 + letter3);
  }
}
