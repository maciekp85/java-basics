package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-23.
 */
public class Numbers2 {

  private int[] numbers;

  public Numbers2() {
    numbers = new int[10];
  }

  public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
    if (index < 0) {
      throw new ArrayIndexOutOfBoundsException( "Index must be greater than 0!" );
    } else if (index >= numbers.length) {
      throw new ArrayIndexOutOfBoundsException( "Index must be lower than array length! " + numbers.length );
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
