package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-27.
 */
public class CrossCircle {

  public static void main(String[] args) {
    int[][] tab = new int[3][3];
    tab[0][0] = 5;
    tab[1][1] = 5;
    tab[2][2] = 5;

    System.out.println("tab[0][0] = " + tab[0][0]);

    int[][] tab2 = new int[3][];
    tab2[0] = new int[3];
    tab2[1] = new int[2];
    tab2[2] = new int[1];
  }
}
