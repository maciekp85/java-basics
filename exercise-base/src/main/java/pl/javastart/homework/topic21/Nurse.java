package pl.javastart.homework.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Nurse extends Person {

  private int overtime;

  public int getOvertime() {
    return overtime;
  }

  public void setOvertime(int overtime) {
    this.overtime = overtime;
  }

  public Nurse(String firstname, String lastname, double salary, int overtime) {
    super( firstname, lastname, salary );
    this.overtime = overtime;
  }

  @Override
  public String toString() {
    return "Nurse{" + super.toString() + "overtime='" + overtime + '\'' + '}';
  }
}
