package pl.javastart.basic.topic20;

/**
 * Created by nishi on 2017-03-07.
 */
public class Tshirt {

  private Size size;

  Tshirt(Size size) {
    setSize( size );
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }
}
