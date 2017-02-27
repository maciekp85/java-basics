package pl.javastart.homework;

/**
 * Created by nishi on 2017-02-27.
 */
public class MultiDimensionalHomework {

  public static void main(String[] args) {

    double[][] tab = new double[3][];
    tab[0] = new double[]{1.0, 1.5, 2.0};
    tab[1] = new double[]{1.5, 2.0, 2.5};
    tab[2] = new double[]{2.0, 2.5, 3.0};

    double diagonalRatioSum1 = tab[0][0] * tab[1][1] * tab[2][2];
    double diagonalRatioSum2 = tab[2][0] * tab[1][1] * tab[0][2];
    System.out.println("Ratios sum of diagonal 1: " + diagonalRatioSum1);
    System.out.println("Ratios sum of diagonal 2: " + diagonalRatioSum2);
    System.out.println("Ratios sum of all diagonals: " + (diagonalRatioSum1 + diagonalRatioSum2));

    double middleRowAndCellSumsRatio = (tab[1][0] + tab[1][1] + tab[1][2]) * (tab[0][1] + tab[1][1] + tab[2][1]);
    System.out.println("Sums ratio of middle row and cell is: " + middleRowAndCellSumsRatio);

    double sumOfAllElementsAtTheEdgeOfArray = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];
    System.out.println("Sum of all elements at the edge of the array is: " + sumOfAllElementsAtTheEdgeOfArray);


  }
}
