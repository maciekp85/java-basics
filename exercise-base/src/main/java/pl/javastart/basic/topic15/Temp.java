package pl.javastart.basic.topic15;

/**
 * Created by nishi on 2017-03-01.
 */
public class Temp {

  public static void main(String[] args) {
    int[] tab = new int[5];
    int i = 0;
    for(int x: tab) {
      x = i++;
    }

    for(int j=0; j<tab.length; j++) {
      System.out.print(tab[j]+" ");
    }
  }
}
