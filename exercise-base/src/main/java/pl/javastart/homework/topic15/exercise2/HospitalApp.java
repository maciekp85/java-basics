package pl.javastart.homework.topic15.exercise2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by nishi on 2017-03-04.
 */
public class HospitalApp {

  public static final int EXIT = 0;
  public static final int ADD_PATIENT = 1;
  public static final int PRINT_PATIENTS = 2;

  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    sc.useLocale( Locale.US );

    int option = -1;
    Hospital hospital = new Hospital();

    while (option != EXIT) {

      displayMenu();

      option = sc.nextInt();
      sc.nextLine();

      switch (option) {
        case ADD_PATIENT:
          Patient patient = new Patient();
          System.out.println( "Add patient:" );
          System.out.println( "First name:" );
          patient.setFirstname( sc.nextLine() );
          System.out.println( "Last name:" );
          patient.setLastname( sc.nextLine() );
          System.out.println( "Pesel:" );
          patient.setPesel( sc.nextLine() );
          hospital.addPatientToQueue( patient );
          break;
        case PRINT_PATIENTS:
          hospital.displayAllRegisteredPatients();
          break;
        default:
          System.out.println( "You have entered wrong option. Try again." );
      }
    }
    sc.close();
  }

  public static void displayMenu() {
    System.out.println();
    System.out.println("Hospital v.01");
    System.out.println("Pick the option:");
    System.out.println("1 - save the patient");
    System.out.println("2 - display all saved patients");
    System.out.println("0 - exit program");
  }
}
