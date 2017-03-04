package pl.javastart.library.app;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.utils.DataReader;

/**
 * Created by nishi on 2017-03-04.
 */
public class LibraryControl {

  // variables to control the program
  public static final int exit = 0;
  public static final int addBook = 1;
  public static final int printBooks = 2;

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
    int option;
    printOptions();
    while ((option = dataReader.getInt()) != exit) {
      switch (option) {
        case addBook:
          addBook();
          break;
        case printBooks:
          printBooks();
          break;
        default:
          System.out.println("There is no option, please enter again");
      }
      printOptions();
    }
    // close input stream
    dataReader.close();
  }

  private void printBooks() {
    library.printBooks();
  }

  private void addBook() {
    Book book = dataReader.readAndCreateBook();
    library.addBook( book );
  }

  private void printOptions() {
    System.out.println("Pick the option:");
    System.out.println("0 - exit program");
    System.out.println("1 - add a new book");
    System.out.println("2 - display available books");
  }
}
