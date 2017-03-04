package pl.javastart.homework.topic15.exercise2;

/**
 * Created by nishi on 2017-03-04.
 */
public class Hospital {

  public static final int MAX_PATIENTS_SUM = 10;
  private Patient[] all;
  private int registerPatients;

  public Hospital() {
    all = new Patient[MAX_PATIENTS_SUM];
    registerPatients = 0;
  }

  public void addPatientToQueue(Patient patient) {
    if (registerPatients < MAX_PATIENTS_SUM) {
      all[registerPatients] = patient;
      registerPatients++;
    } else {
      System.out.println("Limit of adding new patient has finished (10 patients per day)");
    }
  }

  public void displayAllRegisteredPatients() {
    for (int i = 0; i < all.length; i++) {
      System.out.println("Patient " + i + ": firstname( " + all[i].getFirstname() + " )" +
              "lastname( " + all[i].getLastname() + " )" + ", pesel( " + all[i].getPesel() + " )");
    }
  }

}
