package pl.javastart.library.data;

/**
 * Created by nishi on 2017-02-08.
 */
public class Book extends Publication {

  // Fields
  private String author;
  private int pages;
  private String isbn;

  // Setters and getters

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  // Constructors
  public Book(String title, String author, int year, int pages, String publisher, String isbn) {
    super(year, title, publisher);
    this.setAuthor( author );
    this.setPages( pages );
    this.setIsbn( isbn );
  }

  public Book(Book book) {
    this(book.getTitle(), book.getAuthor(), book.getYear(), book.getPages(), book.getPublisher(), book.getIsbn());
  }

  @Override
  public String toString() {
    return getTitle() + "; " + getAuthor() + "; " + getYear() + "; " + getPages()
            + "; " + getPublisher() + "; " + getIsbn();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
    result = prime * result + pages;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    if (author == null) {
      if (other.author != null)
        return false;
    } else if (!author.equals(other.author))
      return false;
    if (isbn == null) {
      if (other.isbn != null)
        return false;
    } else if (!isbn.equals(other.isbn))
      return false;
    if (pages != other.pages)
      return false;
    return true;
  }
}
