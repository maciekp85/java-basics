package pl.javastart.basic.topic15;

/**
 * Created by nishi on 2017-03-01.
 */
public class ForLoop {

  public static void main(String[] args) {
    int[] tab = new int[10];

    for (int i = 0; i < tab.length; i++) {
      tab[i] = i+1;
    }

    for (int i =0; i < tab.length; i++) {
      System.out.println("Tab element: " + tab[i]);
    }
  }
}
