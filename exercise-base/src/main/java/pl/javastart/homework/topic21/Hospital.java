package pl.javastart.homework.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Hospital {

  private static final int MAX_EMPLOYEES = 3;
  private int employeesNumber = 0;
  private Person[] employees;

  public Hospital() {
    setEmployees( new Person[MAX_EMPLOYEES] );
    setEmployeesNumber( 0 );
  }

  public int getEmployeesNumber() {
    return employeesNumber;
  }

  public void setEmployeesNumber(int employeesNumber) {
    this.employeesNumber = employeesNumber;
  }

  public Person[] getEmployees() {
    return employees;
  }

  public void setEmployees(Person[] employees) {
    this.employees = employees;
  }

  public void add(Person person) {
    if (getEmployeesNumber() < MAX_EMPLOYEES) {
      getEmployees()[employeesNumber] = person;
      setEmployeesNumber( getEmployeesNumber() + 1 );
    }
  }

  @Override
  public String toString() {
    String result = "";
    for (int i=0; i<employeesNumber; i++) {
      result += employees[i] + "\n";
    }
    return result;
  }
}
