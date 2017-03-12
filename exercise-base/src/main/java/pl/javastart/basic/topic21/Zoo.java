package pl.javastart.basic.topic21;

/**
 * Created by nishi on 2017-03-11.
 */
public class Zoo {

  public static void main(String[] args) {
    Animal dog = new Dog( "Rex" );
    Animal cat = new Cat( "Filemon" );
    Animal doge = new Animal( "CatDog" );

//    dog.giveVoice();
//    cat.giveVoice();
//    doge.giveVoice();

    Animal[] animals = new Animal[3];
    animals[0] = dog;
    animals[1] = cat;
    animals[2] = doge;

    for (Animal animal: animals) {
      animal.giveVoice();
    }

    changeAnimalName(animals[0], "Doggy");
    animals[0].giveVoice();

    // Casting to variable
    Dog smallDog = (Dog)dog;
    smallDog.bark();

    // Casting (in flight)
    ((Cat)cat).meow();
  }

  private static void changeAnimalName(Animal animal, String name) {
    animal.setName( name );
  }

}
