package pl.javastart.homework;

/**
 * Created by nishi on 2017-02-27.
 */
public class ArraysHomework {

  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {10, 10, 10};

    System.out.println("Sum of numbers for array1: " + sum( array1 ));
    System.out.println("Sum of numbers for array2: " + sum( array2 ));
  }

  public static int sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    return sum;
  }
}
