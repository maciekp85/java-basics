package pl.javastart.basic.topic20;

/**
 * Created by nishi on 2017-03-07.
 */
public enum Size {
  SMALL("small"), MEDIUM("medium"), LARGE("large");

  private String description;

  Size(String desc) {
    this.description = desc;
  }

  public String getDescription() {
    return description;
  }
}
