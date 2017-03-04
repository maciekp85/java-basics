package pl.javastart.basic.topic16;

/**
 * Created by nishi on 2017-03-04.
 */
public class World {

  public static void main(String[] args) {
    Human adam = new Human( "Adam", 178.5 );
    Human eve = new Human( "Eve", 168.4 );

    double avgHeight = (adam.getHeight() + eve.getHeight()) / 2;
    Human.avgHeight = avgHeight;

    System.out.println("First humans in the world: ");
    System.out.println(adam.getName() + " " + adam.getHeight() + " cm");
    System.out.println(eve.getName() + " " + eve.getHeight() + " cm");

    System.out.println("Average height: ");
    System.out.println(adam.avgHeight);
    System.out.println(eve.avgHeight);
    System.out.println(Human.avgHeight);
  }
}
