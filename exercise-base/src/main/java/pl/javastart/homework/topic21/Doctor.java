package pl.javastart.homework.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Doctor extends Person {

  private double bonus;

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public Doctor(String firstname, String lastname, double salary, double bonus) {
    super( firstname, lastname, salary );
    this.bonus = bonus;
  }

  @Override
  public String toString() {
    return "Doctor{" + super.toString() + "bonus='" + bonus + '\'' + '}';
  }
}
