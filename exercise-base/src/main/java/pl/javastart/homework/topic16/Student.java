package pl.javastart.homework.topic16;

/**
 * Created by nishi on 2017-03-04.
 */
public class Student {

  public static int counter = 0;

  private String firstname;
  private String lastname;
  private String index;

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public Student(String firstname, String lastname, String index) {
    this.setFirstname( firstname );
    this.setLastname( lastname );
    this.setIndex( index );
    // increase amount of students
    counter++;
  }
}
