package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-24.
 */
public class SchoolTest {

  public static void main(String[] args) {
    School school = new School();
    Student student1 = new Student( "John", "Rambo" );
    Student student2 = new Student( "Mark", "Bronson" );
    Student student3 = new Student( "Robert", "Green" );
    Student student4 = new Student( "Mike", "Tyson" );
    Student student5 = new Student( "Robert", "Mason" );

    try {
      school.add( student1 );
      school.add( student2 );
      school.add( student3 );
      school.add( student4 );
    school.add( student5 );  // throws no more space exception
    } catch (NoMoreSpaceException e) {
      System.err.println( "You can not add so many students to school" );
      System.err.println( e.getMessage() );
    }

    try {
      System.out.println("Found student: " + school.find( "Mark", "Bronson" ));
    System.out.println("Found student: " + school.find( "Mark", "Jonson" )); // throws no element found exception
    } catch (NoElementFoundException e) {
      System.err.println( "No that person found!" );
      System.err.println( e.getMessage() );
    }

  }
}
