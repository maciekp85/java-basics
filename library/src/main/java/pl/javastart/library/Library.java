package pl.javastart.library;

/**
 * Created by nishi on 2017-02-07.
 */
public class Library {

  public static void main(String args[]) {
    final String appName = "Library v0.1";

    String title = "W pustyni i w puszczy";
    String author = "Henryk Sienkiewicz";
    int releaseDate = 2010;
    int pages = 296;
    String publisher = "Greg";
    String isbn = "9788373271890";

    System.out.print(appName);
    System.out.println("Books are available in library: ");
    System.out.println(title);
    System.out.println(author);
    System.out.println(releaseDate);
    System.out.println(pages);
    System.out.println(publisher);
    System.out.println(isbn);
  }
}
