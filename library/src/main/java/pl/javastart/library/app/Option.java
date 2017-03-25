package pl.javastart.library.app;

import java.util.NoSuchElementException;

/**
 * Created by nishi on 2017-03-08.
 */
public enum Option {

  EXIT(0, "Exit from program"),
  ADD_BOOK(1, "Add a book"),
  ADD_MAGAZINE(2,"Add a magazine/newspapers"),
  PRINT_BOOKS(3, "Display of available books"),
  PRINT_MAGAZINES(4, "Display of available magazines/newspapers");

  private int value;
  private String description;

  public int getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }

  Option(int value, String desc) {
    this.value = value;
    this.description = desc;
  }

  @Override
  public String toString() {
    return value + " - " + description;
  }

  public static Option createFromInt(int option) throws NoSuchElementException {
    Option result = null;
    try {
      result = Option.values()[option];
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new NoSuchElementException( "No element with passed ID" );
    }
    return result;
  }

}
