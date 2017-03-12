package pl.javastart.homework.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class HospitalApp {

  public static void main(String[] args) {

    Person doctor = new Doctor( "John", "Phillips", 12000.00, 800.00 );
    Person nurseAlice = new Nurse( "Alice", "Cox", 6000.00, 6);
    Person nurseMeg = new Nurse( "Meg", "Ryan", 7000.00, 12 );

    Hospital hospital = new Hospital();
    hospital.add( doctor );
    hospital.add( nurseAlice );
    hospital.add( nurseMeg );

    System.out.println("Persons in hospital:");
    System.out.println(hospital);
  }
}
