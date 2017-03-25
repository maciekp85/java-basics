package pl.javastart.library.utils;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.data.Magazine;
import pl.javastart.library.data.Publication;

/**
 * Created by nishi on 2017-03-26.
 */
public class LibraryUtils {

  public static void printBooks(Library lib) {
    Publication[] publications = lib.getPublications();
    int publicationsNumber = lib.getPublicationsNumber();
    int countBooks = 0;
    for (int i = 0; i < publicationsNumber; i++) {
      if (publications[i] instanceof Book) {
        System.out.println( publications[i] );
        countBooks++;
      }
    }
    if (countBooks == 0) {
      System.out.println( "No books in the library" );
    }
  }

  public static void printMagazines(Library lib) {
    Publication[] publications = lib.getPublications();
    int publicationsNumber = lib.getPublicationsNumber();
    int countMagazines = 0;
    for (int i = 0; i < publicationsNumber; i++) {
      if (publications[i] instanceof Magazine) {
        System.out.println( publications[i] );
        countMagazines++;
      }
    }
    if (countMagazines == 0) {
      System.out.println( "No magazines in the library" );
    }
  }
}
