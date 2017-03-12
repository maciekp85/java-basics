package pl.javastart.basic.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Animal {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Animal(String name) {
    setName( name );
  }

  public void giveVoice() {
    System.out.println("I am an animal and my name is " + getName());
  }
}
