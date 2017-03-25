package pl.javastart.library.utils;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Magazine;

import java.util.InputMismatchException;
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

  public int getInt() throws NumberFormatException {
    int number = 0;
    try {
      number = sc.nextInt();
    } catch (InputMismatchException e) {
      throw new NumberFormatException( "Entered number does not have correct form" );
    } finally {
      sc.nextLine();
    }
    return number;
  }

  public Book readAndCreateBook() throws InputMismatchException {
    System.out.println("Title: ");
    String title = sc.nextLine();
    System.out.println("Author: ");
    String author = sc.nextLine();
    System.out.println("Publisher: ");
    String publisher = sc.nextLine();
    System.out.println("ISBN: ");
    String isbn = sc.nextLine();
    System.out.println("Release date: ");
    int releaseDate = 0;
    int pages = 0;
    try {
      releaseDate = sc.nextInt();
      sc.nextLine();
      System.out.println("Pages size: ");
      pages = sc.nextInt();
    } catch (InputMismatchException e) {
      sc.nextLine();
      throw e;
    }

    return new Book( title, author, releaseDate, pages, publisher, isbn );
  }

  public Magazine readAndCreateMagazine() throws InputMismatchException {
    System.out.println("Title: ");
    String title = sc.nextLine();
    System.out.println("Publisher: ");
    String publisher = sc.nextLine();
    System.out.println("Language: ");
    String language = sc.nextLine();
    System.out.println("Release date: ");
    int year = 0;
    int month = 0;
    int day = 0;
    try {
      year = sc.nextInt();
      sc.nextLine();
      System.out.println("Month: ");
      month = sc.nextInt();
      sc.nextLine();
      System.out.println("Day: ");
      day = sc.nextInt();
      sc.nextLine();
    } catch (InputMismatchException e) {
      sc.nextLine();
      throw e;
    }

    return new Magazine( title, publisher, language, year, month, day );
  }
}
