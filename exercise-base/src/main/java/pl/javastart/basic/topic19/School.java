package pl.javastart.basic.topic19;

/**
 * Created by nishi on 2017-03-05.
 */
public class School {

  public static void main(String[] args) {

    // First example
    Student student1 = new Student( "Maciej", "Piotrowski" );
    Student student2 = new Student( "Maciej", "Piotrowski" );

    System.out.println("Comparison: student1 == student2");
    System.out.println(student1 == student2);
    System.out.println("Comparison: student1.equals(student2)");
    System.out.println(student1.equals( student2 ));

    // Second example
    Student student3 = new Student( "Maciej", "Piotrowski" );
    Student student4 = student3;

    System.out.println("Comparison: student3 == student4");
    System.out.println(student3 == student4);
    System.out.println("Comparison: student3.equals(student4)");
    System.out.println(student3.equals( student4 ));

    // Third example
    Student student5 = new Student( "Jan", "Kowalski" );
    System.out.println("Students list: ");
    student5.printInfo();

    // Fourth example
    // Use of overridden toString() method
    System.out.println("Students list again: ");
    System.out.println(student5);

    // Sixth example
    String student5Desc = student5.toString();
    System.out.println(student5Desc);

    // Seventh example
    Student[] students = new Student[3];
    students[0] = new Student( "Marek", "Kot" );
    students[1] = new Student( "Jan", "Pies" );
    students[2] = new Student( "Wiesław", "Ryba" );

    System.out.println("\nStudents list: ");
    for (Student student: students) {
      System.out.println(student);
    }
  }
}
