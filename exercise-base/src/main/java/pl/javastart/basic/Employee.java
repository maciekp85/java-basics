package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-26.
 */
public class Employee {

  private String name;
  private String lastname;
  private double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  Employee(String name, String lastname, double salary) {
    setName( name );
    setLastname( lastname );
    setSalary( salary );
  }
}
