package pl.javastart.basic.topic17;

/**
 * Created by nishi on 2017-03-05.
 */
public class Zoo {

  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.color = "black";
    Bird bird = new Bird();
    bird.color = "blue";
    System.out.println("Animals make sound: ");
    System.out.println("Cat: ");
    cat.makeSound();
    System.out.println("Bird: ");
    bird.makeSound();
  }
}
