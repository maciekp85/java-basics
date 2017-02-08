package pl.javastart.homework;

/**
 * Created by nishi on 2017-02-08.
 */
public class Company {

  static Employee employee1, employee2, employee3;

  public static void main(String args[]) {

    employee1 = new Employee();
    employee1.firstName = "John";
    employee1.lastName = "Wayne";
    employee1.birthDate = 1980;
    employee1.seniority = 5;

    String employee1Info = employee1.firstName + " " + employee1.lastName
                          + ", Birth date: " + employee1.birthDate
                          + ", Seniority: " + employee1.seniority;

    System.out.println(employee1Info);

    employee2 = new Employee();
    employee2.firstName = "Richard";
    employee2.lastName = "Bronson";
    employee2.birthDate = 1972;
    employee2.seniority = 15;

    String employee2Info = employee2.firstName + " " + employee2.lastName
            + ", Birth date: " + employee2.birthDate
            + ", Seniority: " + employee2.seniority;

    System.out.println(employee2Info);

    employee3 = new Employee();
    employee3.firstName = "Mike";
    employee3.lastName = "Tyson";
    employee3.birthDate = 1977;
    employee3.seniority = 12;

    String employee3Info = employee3.firstName + " " + employee3.lastName
            + ", Birth date: " + employee3.birthDate
            + ", Seniority: " + employee3.seniority;

    System.out.println(employee3Info);
  }
}
