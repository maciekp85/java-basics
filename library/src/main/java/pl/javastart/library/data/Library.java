package pl.javastart.library.data;

/**
 * Created by nishi on 2017-03-04.
 */
public class Library {

  public final int maxBooks = 1000;
  private Book[] books;
  private int booksNumber;

  public Book[] getBooks() {
    return books;
  }

  public int getBooksNumber() {
    return booksNumber;
  }

  public Library() {
    books = new Book[maxBooks];
  }

  public void addBook(Book book) {
    if (booksNumber < maxBooks) {
      books[booksNumber] = book;
      booksNumber++;
    } else {
      System.out.println("Max amount of books has achieved");
    }
  }

  public void printBooks() {
    if (booksNumber == 0) {
      System.out.println("No books in the library");
    }
    for (int i = 0; i < booksNumber; i++) {
      books[i].printInfo();
    }
  }
}
