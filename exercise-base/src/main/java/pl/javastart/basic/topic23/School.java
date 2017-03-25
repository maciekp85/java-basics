package pl.javastart.basic.topic23;

/**
 * Created by nishi on 2017-03-24.
 */
public class School {
  Student[] students;
  private static int index = 0;

  public School() {
    students = new Student[4];
  }

  public void add(Student student) throws NoMoreSpaceException {
    if(index >= students.length) {
      throw new NoMoreSpaceException( "No more space in school " + students.length );
    } else {
      students[index] = student;
      index++;
    }
  }

  public Student find(String firstname, String lastname) throws NoElementFoundException {
    boolean found = false;
    Student foundStudent = null;
    int index = 0;
    while (!found && index < students.length) {
      if (students[index].getFirstname().equals( firstname ) && students[index].getLastname().equals( lastname )) {
        foundStudent = students[index];
        found = true;
      } else {
        index++;
      }
    }

    if (foundStudent == null) {
      throw new NoElementFoundException("No element found " + firstname + " " + lastname);
    }
    return foundStudent;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder(  );
    for (Student student: students) {
      builder.append( student.getId() + ", " + student.getFirstname() + " " + student.getLastname() );
      builder.append( "\n" );
    }
    return builder.toString();
  }
}
