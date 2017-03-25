package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-24.
 */
public class Student {

  private int id;
  private String firstname;
  private String lastname;
  private static int count = 0;

  public Student(String firstname, String lastname) {
    this.setId( count++ );
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

  @Override
  public String toString() {
    return "{" +
            "id=" + id +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }
}
