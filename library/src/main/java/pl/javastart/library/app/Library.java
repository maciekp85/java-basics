package pl.javastart.library.app;

import pl.javastart.library.data.Book;
import pl.javastart.library.utils.DataReader;

/**
 * Created by nishi on 2017-02-07.
 */
public class Library {

  public static void main(String args[]) {
    final String appName = "Library v0.7\n";

    Book[] books = new Book[1000];
    DataReader dataReader = new DataReader();

    System.out.println(appName);
    System.out.println("Enter a new book: ");
    books[0] = dataReader.readAndCreateBook();
    books[1] = dataReader.readAndCreateBook();
    dataReader.close();

    System.out.println("Books are available in library: ");
    books[0].printInfo();
    books[1].printInfo();
    System.out.println("System can store up to " + books.length + " books");
  }
}
