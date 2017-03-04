package pl.javastart.library.utils;

import pl.javastart.library.data.Book;

import java.util.Scanner;

/**
 * Created by nishi on 2017-02-28.
 */
public class DataReader {

  private Scanner sc;

  public DataReader() {
    this.sc = new Scanner( System.in );
  }

  public void close() {
    sc.close();
  }

  public int getInt() {
    int number = sc.nextInt();
    sc.nextLine();
    return number;
  }

  public Book readAndCreateBook() {
    System.out.println("Title: ");
    String title = sc.nextLine();
    System.out.println("Author: ");
    String author = sc.nextLine();
    System.out.println("Publisher: ");
    String publisher = sc.nextLine();
    System.out.println("ISBN: ");
    String isbn = sc.nextLine();
    System.out.println("Release date: ");
    int releaseDate = sc.nextInt();
    sc.nextLine();
    System.out.println("Pages: ");
    int pages = sc.nextInt();
    sc.nextLine();

    return new Book( title, author, releaseDate, pages, publisher, isbn );
  }


}
