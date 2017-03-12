package pl.javastart.basic.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void giveVoice() {
    System.out.println("I am a dog and my name is " + getName());
  }

  public void bark() {
    System.out.println("Hau hau...");
  }
}
