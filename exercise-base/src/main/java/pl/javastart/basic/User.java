package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-26.
 */
public class User {

  private String name;
  private String lastname;

  User(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public void printUser() {
    System.out.println("User info: " + name + " " + lastname);
  }

  public void modifyUser(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
    System.out.println("Modified user: " + name + " " + lastname);
  }
}
