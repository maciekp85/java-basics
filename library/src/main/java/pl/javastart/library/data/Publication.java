package pl.javastart.library.data;

/**
 * Created by nishi on 2017-03-05.
 */
public class Publication {

  private int year;
  private String title;
  private String publisher;

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  protected Publication(int year, String title, String publisher) {
    setYear( year );
    setTitle( title );
    setPublisher( publisher );
  }
}
