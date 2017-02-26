package pl.javastart.basic;

import java.text.DecimalFormat;

/**
 * Created by nishi on 2017-02-26.
 */
public class Company {

  public static void main(String[] args) {
    Employee[] employees = new Employee[20];
    employees[0] = new Employee( "Jan", "Kowalski", 1550.60 );
    employees[1] = new Employee( "Robert", "Górski", 2550.60 );
    employees[2] = new Employee( "Kazimierz", "Tetmajer", 3550.60 );
    employees[3] = new Employee( "Marta", "Radomska", 4550.60 );
    employees[4] = new Employee( "Julia", "Rakoczy", 550.60 );

    int employeeNumber = 2;
    int arraySize = employees.length;
    DecimalFormat df = new DecimalFormat( "0.00" );

    System.out.println(employees[employeeNumber - 1].getName() + " " + employees[employeeNumber - 1].getLastname()
                        + " : " + df.format( employees[employeeNumber - 1].getSalary()) + " zł");

    System.out.println("Array size is: " + arraySize);
    // Error (ArrayInxedOutOfBoundsException) - last index of 20 elements array is 19
/*
    System.out.println(employees[20]);
    System.out.println("This code will not show because of array index out of bounds exception");
*/

    // Error (NullPointerException) - last index of 20 elements array is 19
/*
    System.out.println(employees[5].getName() + employees[5].getLastname());
    System.out.println("Last element of array is " + employees[arraySize - 1].getName() + employees[arraySize - 1].getLastname());
    System.out.println("This code will not show because of null pointer exception");
*/

  }
}
