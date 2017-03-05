package pl.javastart.library.app;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.data.Magazine;
import pl.javastart.library.utils.DataReader;

/**
 * Created by nishi on 2017-03-04.
 */
public class LibraryControl {

  // variables to control the program
  public static final int EXIT = 0;
  public static final int ADD_BOOK = 1;
  private static final int ADD_MAGAZINE = 2;
  public static final int PRINT_BOOKS = 3;
  public static final int PRINT_MAGAZINES = 4;

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
    while ((option = dataReader.getInt()) != EXIT) {
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
        default:
          System.out.println("There is no option, please enter again");
      }
      printOptions();
    }
    // close input stream
    dataReader.close();
  }

  private void printOptions() {
    System.out.println("Pick the option:");
    System.out.println(EXIT + " - EXIT program");
    System.out.println(ADD_BOOK + " - add a new book");
    System.out.println(ADD_MAGAZINE + " - add a new magazine");
    System.out.println(PRINT_BOOKS + " - display available books");
    System.out.println(PRINT_MAGAZINES + " - display available magazines");
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
