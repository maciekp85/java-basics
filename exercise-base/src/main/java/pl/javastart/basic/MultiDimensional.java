package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-27.
 */
public class MultiDimensional {

  public static void main(String[] args) {
    String[] firstNames = new String[]{"Jan", "Kazimierz", "Andrzej"};
    String[] lastNames = new String[]{"Kowalski", "Górski", "Kownacki"};

    String[][] tab = new String[2][];
    tab[0] = firstNames;
    tab[1] = lastNames;

    // Other solution
    String[][] tab2 = {firstNames, lastNames};

    System.out.println("First person is " + tab[0][0] + " " + tab[1][0]);
    System.out.println("Second person is " + tab[0][1] + " " + tab[1][1]);
    System.out.println("Third person is " + tab2[0][2] + " " + tab2[1][2]);

    int[] longTab = new int[1000];
    longTab[99] = 100;
    int[] midTab = new int[100];
    int[] smallTab = new int[10];

    int[][] hugeTab = new int[3][];
    hugeTab[0] = longTab;
    hugeTab[1] = midTab;
    hugeTab[2] = smallTab;

    System.out.println("Arrays length");
    System.out.println(hugeTab[0].length + " ; " + hugeTab[1].length + " : " + hugeTab[2].length);
    System.out.println("100th element of first array is: " + hugeTab[0][99]);

  }
}
