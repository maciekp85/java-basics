package pl.javastart.homework.topic17;

/**
 * Created by nishi on 2017-03-05.
 */
public class Tire extends ExhaustPart {

  private double size;
  private double weight;

  public Tire(String id, double size, double weight, boolean isCompatibleWithEmissionsStandard) {
    setSize( size );
    setWeight( weight );
    setId( id );
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
