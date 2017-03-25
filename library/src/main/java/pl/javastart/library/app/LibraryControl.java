package pl.javastart.library.app;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.data.Magazine;
import pl.javastart.library.utils.DataReader;
import pl.javastart.library.utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

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
    Option option = null;
    while (option != Option.EXIT) {
      try {
        printOptions();
        option = Option.createFromInt( dataReader.getInt());
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
            ;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entered wrong data, publication did not add");
      } catch (NumberFormatException | NoSuchElementException e) {
        System.out.println("Chose option does not exist, try to choose again:");
      }
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
    LibraryUtils.printBooks(library);
  }

  private void addMagazine() {
    Magazine magazine = dataReader.readAndCreateMagazine();
    library.addMagazine( magazine );
  }

  private void printMagazines() {
    LibraryUtils.printMagazines( library );
  }

}
