package pl.javastart.library.app;

import pl.javastart.library.data.Book;

/**
 * Created by nishi on 2017-02-07.
 */
public class Library {

  public static void main(String args[]) {
    final String appName = "Library v0.6\n";

    Book[] books = new Book[1000];
    books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296,
            "Greg", "9788373271890");
    books[1] = new Book("Java. Efektywne programowanie. Wydanie II", " Joshua Bloch", 2009,
            352, "Helion", "9788324620845");
    books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
            "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media",
            "9780071591065");
    Book book1Copy = new Book( books[0] );

    System.out.print(appName);
    System.out.println("Books are available in library: ");
    books[0].printInfo();
    books[1].printInfo();
    books[2].printInfo();
    book1Copy.printInfo();
    System.out.println("System can store up to " + books.length + " books");
  }
}
