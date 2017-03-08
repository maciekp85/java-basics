package pl.javastart.homework.topic20.firstway;

/**
 * Created by nishi on 2017-03-08.
 */
public enum Pizza {
  MARGHERITA("tomato sauce + cheese"), CAPRICIOSA("tomato sauce + cheese + mushrooms"), PROSCIUTTO("tomato sauce + cheese + ham");

  private String description;

  Pizza(String desc) {
    this.description = desc;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return " {" + description + "}";
  }
}
