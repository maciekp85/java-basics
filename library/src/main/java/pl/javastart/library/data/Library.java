package pl.javastart.library.data;

/**
 * Created by nishi on 2017-03-04.
 */
public class Library {

  public static final int MAX_PUBLICATIONS = 2000;
  private Publication[] publications;
  private int publicationsNumber;

  public int getPublicationsNumber() {
    return publicationsNumber;
  }

  public Publication[] getPublications() {
    return publications;
  }

  public Library() {
    publications = new Publication[MAX_PUBLICATIONS];
  }

  public void addBook(Book book) {
    addPublication( book );
  }

  public void addMagazine(Magazine magazine) {
    addPublication( magazine );
  }

  private void addPublication(Publication pub) {
    if (publicationsNumber < MAX_PUBLICATIONS) {
      publications[publicationsNumber] = pub;
      publicationsNumber++;
    } else {
      System.out.println( "Max number of publications has achieved" );
    }
  }

  public void printBooks() {
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

  public void printMagazines() {
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