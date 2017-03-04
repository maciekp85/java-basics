package pl.javastart.homework.topic16;

/**
 * Created by nishi on 2017-03-04.
 */
public class University {

  public static void main(String[] args) {
    System.out.println("Amount of students before added them: " + Student.counter);

    Student firstStudent = new Student("Robert", "Montgomery", "198678");
    Student secondStudent = new Student("Mick", "Jagger", "178988");

    System.out.println("Added students: ");
    System.out.println("Student: " + firstStudent.getFirstname() + " " + firstStudent.getLastname() + ", index: " + firstStudent.getIndex());
    System.out.println("Student: " + secondStudent.getFirstname() + " " + secondStudent.getLastname() + ", index: " + secondStudent.getIndex());
    System.out.println("Amount of students after added them: " + Student.counter);
  }
}
