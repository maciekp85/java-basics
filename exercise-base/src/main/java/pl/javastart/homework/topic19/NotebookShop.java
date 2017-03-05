package pl.javastart.homework.topic19;

/**
 * Created by nishi on 2017-03-05.
 */
public class NotebookShop {

  public static void main(String[] args) {

    DataStore ds = new DataStore();

    Computer ibm = new Computer( "IBM", 12323 );
    Computer lenovo = new Computer( "Lenovo", 53453 );
    Computer sony = new Computer( "Sony", 6 );
    Computer acer = new Computer( "Acer", 12323 );
    Computer ibm2 = new Computer( "IBM", 12323 );

    ds.add( ibm );
    ds.add( sony );
    ds.add( lenovo );
    ds.add( acer );
    ds.add( ibm2 );

    int numberIbmComputers = ds.checkAvailability( ibm );

    System.out.println("Number of IBM computers: " + numberIbmComputers);
    System.out.println("All computers in the store: ");
    for (Computer c: ds.getComputers()) {
      System.out.println(c);
    }

  }
}
