package pl.javastart.homework.topic19;

/**
 * Created by nishi on 2017-03-05.
 */
public class DataStore {

  public static final int MAX_COMPUTERS = 100;
  private int computersNumber;
  private Computer[] computers;

  public int getComputersNumber() {
    return computersNumber;
  }

  public void setComputersNumber(int computersNumber) {
    this.computersNumber = computersNumber;
  }

  public Computer[] getComputers() {
    Computer[] comps = new Computer[computersNumber];
    for (int i=0; i < computersNumber; i++) {
      comps[i] = computers[i];
    }
    return comps;
  }

  public void setComputers(Computer[] computers) {
    this.computers = computers;
  }

  public DataStore() {
    this.computers = new Computer[MAX_COMPUTERS];
    this.computersNumber = 0;
  }

  public void add(Computer computer) {
    if(computersNumber < MAX_COMPUTERS) {
      computers[computersNumber] = computer;
      computersNumber++;
    } else {
      System.out.println("Max number of computers has achieved");
    }
  }

  public int checkAvailability(Computer find) {
    if(find == null)
      return 0;

    int count = 0;
    for (int i=0; i < computersNumber; i++) {
      if (find.equals( computers[i] ))
        count++;
    }
    return count;
  }
}
