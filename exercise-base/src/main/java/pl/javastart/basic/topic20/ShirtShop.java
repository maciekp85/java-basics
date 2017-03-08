package pl.javastart.basic.topic20;

/**
 * Created by nishi on 2017-03-07.
 */
public class ShirtShop {

  public static void main(String[] args) {
    Tshirt tshirt = new Tshirt( Size.SMALL );
    System.out.println(tshirt.getSize());
    System.out.println(tshirt.getSize().getDescription());
    System.out.println(tshirt.getSize().name());

    System.out.println("Available sizes of tshirts: ");
    for (Size s: Size.values()) {
      System.out.println(s.getDescription());
    }

    tshirt.setSize(Size.valueOf("MEDIUM"));
    System.out.println("You chose " + tshirt.getSize().getDescription() + " size");
    Size tshirtSize = sizeFromDescription( "small" );
    tshirt.setSize( tshirtSize );
    System.out.println( tshirt.getSize().getDescription());
  }

  private static Size sizeFromDescription(String desc) {
    for (Size s: Size.values()) {
      if(s.getDescription().equals( desc))
        return s;
    }
    return Size.MEDIUM;
  }
}
