package pl.javastart.homework.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Person {

  private String firstname;
  private String lastname;
  private double salary;

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Person(String firstname, String lastname, double salary) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", salary='" + salary + '\'' + " ";
  }
}
