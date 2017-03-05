package pl.javastart.basic.topic19;

/**
 * Created by nishi on 2017-03-05.
 */
public class Student {

  String firstname;
  String lastname;

  public Student(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public void printInfo() {
    System.out.println(firstname + " " + lastname );
  }

  @Override
  public boolean equals(Object obj) {

    // Check of physical equality using ==
    if (this == obj)
      return true;

    // Check if argument is not null
    if (obj == null)
      return false;

    // check if passed argument is a Student type
    if(!(obj instanceof Student))
      return false;

    // Cast to the appropriate type
    Student s = (Student)obj;

    // Check the following fields being careful of null values
    if(this.firstname == s.firstname && this.lastname == s.lastname)
      return true;
    if(this.firstname != null) {
      if(!this.firstname.equals( s.firstname ))
        return false;
    }
    if(this.lastname != null) {
      if(!this.lastname.equals( s.firstname ))
        return false;
    }

    // If we will come to this place it means that objects are equal
    return true;
  }

  @Override
  public String toString() {
    return firstname + " " + lastname;
  }
}
