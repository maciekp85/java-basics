package pl.javastart.library.app;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.data.Magazine;
import pl.javastart.library.utils.DataReader;

/**
 * Created by nishi on 2017-03-04.
 */
public class LibraryControl {

  // variable to communicate with user
  private DataReader dataReader;

  // "library" stores data
  private Library library;

  public LibraryControl() {
    dataReader = new DataReader();
    library = new Library();
  }

  /*
  * Main program loop which which will allow to choose options and interaction
  */
  public void controlLoop() {
    Option option;
    printOptions();
    while ((option = Option.createFromInt( dataReader.getInt())) != Option.EXIT) {
      switch (option) {
        case ADD_BOOK:
          addBook();
          break;
        case ADD_MAGAZINE:
          addMagazine();
          break;
        case PRINT_BOOKS:
          printBooks();
          break;
        case PRINT_MAGAZINES:
          printMagazines();
          break;
        case EXIT:
      }
      printOptions();
    }
    // close input stream
    dataReader.close();
  }

  private void printOptions() {
    System.out.println("Pick the option:");
    for (Option o: Option.values()) {
      System.out.println(o);
    }
  }

  private void addBook() {
    Book book = dataReader.readAndCreateBook();
    library.addBook( book );
  }

  private void printBooks() {
    library.printBooks();
  }

  private void addMagazine() {
    Magazine magazine = dataReader.readAndCreateMagazine();
    library.addMagazine( magazine );
  }

  private void printMagazines() {
    library.printMagazines();
  }

}
