package pl.javastart.homework.topic20.secondway;

/**
 * Created by nishi on 2017-03-08.
 */
public enum Pizza {
  MARGHERITA(true, true, false, false),
  CAPRICIOSA(true, true, true, false),
  PROSCIUTTO(true, true, false, true);

  private boolean tomatoSauce;
  private boolean cheese;
  private boolean mushrooms;
  private boolean ham;

  public boolean isTomatoSauce() {
    return tomatoSauce;
  }

  public boolean isCheese() {
    return cheese;
  }

  public boolean isMushrooms() {
    return mushrooms;
  }

  public boolean isHam() {
    return ham;
  }

  Pizza(boolean ts, boolean ch, boolean m, boolean h) {
    this.tomatoSauce = ts;
    this.cheese = ch;
    this.mushrooms = m;
    this.ham = h;
  }

  @Override
  public String toString() {
    // assign of name to pizza
    String result = this.name() + " (";
    // info about ingredients
    if(tomatoSauce) {
      result = result + "sos pomidorowy";
    }
    if(cheese) {
      result = result + ", ser";
    }
    if(mushrooms) {
      result = result + ", pieczarki";
    }
    if(ham) {
      result = result + ", szynka";
    }
    result = result + ")";

    return result;
  }
}
