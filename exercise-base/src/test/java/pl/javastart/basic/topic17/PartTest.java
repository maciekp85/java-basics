package pl.javastart.basic.topic17;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import pl.javastart.homework.topic17.Tire;
import pl.javastart.homework.topic17.Wheel;

/**
 * Created by nishi on 2017-03-05.
 */
public class PartTest {

  @Test
  public void testPart() {
    Tire tire = new Tire("1354546", 165.8, 80.5, true );
    Wheel wheel = new Wheel( "120899", 145.5, 67.9, false );

    assertNotNull( tire );
    assertNotNull( wheel );

    tire.setModel( "ASC" );
    tire.setSeries( "234A" );
    tire.setProducerName( "Rosmer" );

    wheel.setModel( "32Z" );
    wheel.setSeries( "123456CV" );
    wheel.setProducerName( "Goodyear" );

    System.out.println("Tire: id = " + tire.getId() + ", model = " + tire.getModel() + ", series = " + tire.getSeries()
            + ", producer = " + tire.getProducerName() + ", size = " + tire.getSize() + ", weight = " + tire.getWeight() + " ");

    System.out.println("Wheel: id = " + wheel.getId() + ", model = " + wheel.getModel() + ", series = " + wheel.getSeries()
            + ", producer = " + wheel.getProducerName() + ", size = " + wheel.getSize() + ", weight = " + wheel.getWeight() + " ");

    assertThat( tire.getModel(), equalTo( "ASC" ) );
    assertThat( wheel.getModel(), equalTo( "32Z" ) );
  }
}
