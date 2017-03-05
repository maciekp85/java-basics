package pl.javastart.homework.topic19;


/**
 * Created by nishi on 2017-03-05.
 */
public class Computer {

  private String producer;
  private int model;

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public int getModel() {
    return model;
  }

  public void setModel(int model) {
    this.model = model;
  }

  public Computer(String producer, int model) {
    setProducer( producer );
    setModel( model );
  }

  @Override
  public String toString() {
    return "Producer: " + getProducer() + ", model = " + getModel();
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;

    if (obj == null)
      return false;

    if(!(obj instanceof Computer))
      return false;

    Computer c = (Computer)obj;

    if(this.producer == c.producer && this.model == c.model)
      return true;
    if (this.producer != null) {
      if (this.producer.equals( c.getProducer()) && c.getModel() == this.getModel())
        return true;
    }

    return false;
  }
}
