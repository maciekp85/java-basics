package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-23.
 */
public class Numbers {

  private int[] numbers;

  public Numbers() {
    numbers = new int[10];
  }

  public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
    if (index < 0 || index >= numbers.length) {
      throw new ArrayIndexOutOfBoundsException( index );
    }
    numbers[index] = number;
  }

  public int get(int index) throws ArrayIndexOutOfBoundsException {
    if (index < 0 || index >= numbers.length) {
      throw new ArrayIndexOutOfBoundsException( index );
    }
    return numbers[index];
  }
}
