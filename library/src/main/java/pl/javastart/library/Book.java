package pl.javastart.library;

/**
 * Created by nishi on 2017-02-08.
 */
public class Book {

  String title;
  String author;
  int releaseDate;
  int pages;
  String publisher;
  String isbn;

  Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
    this.title = title;
    this.author = author;
    this.releaseDate = releaseDate;
    this.pages = pages;
    this.publisher = publisher;
    this.isbn = isbn;
  }

  Book(Book book) {
    this(book.title, book.author, book.releaseDate, book.pages, book.publisher, book.isbn);
  }

  void printInfo() {
    String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher
            + "; " + isbn;
    System.out.println(info);
  }
}
