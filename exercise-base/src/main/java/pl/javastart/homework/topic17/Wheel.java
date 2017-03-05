package pl.javastart.homework.topic17;

/**
 * Created by nishi on 2017-03-05.
 */
public class Wheel extends ExhaustPart {

  private double size;
  private double weight;

  public Wheel(String id, double size, double weight, boolean isCompatibleWithEmissionsStandard) {
    setId( id );
    setSize( size );
    setWeight( weight );
    setCompatibleWithEmissionsStandard( isCompatibleWithEmissionsStandard);
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
