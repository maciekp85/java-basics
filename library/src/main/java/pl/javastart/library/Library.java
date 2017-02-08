package pl.javastart.library;

/**
 * Created by nishi on 2017-02-07.
 */
public class Library {

  public static void main(String args[]) {
    final String appName = "Library v0.1";

    Book book1 = new Book();
    book1.title = "W pustyni i w puszczy";
    book1.author = "Henryk Sienkiewicz";
    book1.releaseDate = 2010;
    book1.pages = 296;
    book1.publisher = "Greg";
    book1.isbn = "9788373271890";

    System.out.print(appName);
    System.out.println("Books are available in library: ");
    System.out.println(book1.title);
    System.out.println(book1.author);
    System.out.println(book1.releaseDate);
    System.out.println(book1.pages);
    System.out.println(book1.publisher);
    System.out.println(book1.isbn);
  }
}
