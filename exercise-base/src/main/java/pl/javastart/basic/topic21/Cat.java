package pl.javastart.basic.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void giveVoice() {
    System.out.println("I am a cat and my name is " + getName());
  }

  public void meow() {
    System.out.println("Miau miau...");
  }
}
