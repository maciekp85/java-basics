package pl.javastart.basic.topic17.second;

import pl.javastart.basic.topic17.first.Parent;

/**
 * Created by nishi on 2017-03-05.
 */
public class Child extends Parent {

  public Child() {
    name = "Hello"; // everything is ok, "name" has protected specifier
    // value = 5; // error, "value" field is not extended from Parent class
  }
}
