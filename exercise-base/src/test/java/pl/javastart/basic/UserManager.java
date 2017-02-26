package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-26.
 */
public class UserManager {

  public static void main(String args[]) {
    User user = new User( "Jan", "Kowalski" );

    System.out.println("What do you want to do?");
    System.out.println("0 - print info about user");
    System.out.println("1 - exit program");
    System.out.println("2 - modify user");

    int option = 2;
    System.out.println("You have chosen " + option + " option: ");

    if(option == 0) {
      user.printUser();
    } else if (option == 1) {
      System.out.println("Exit program");
      return;
    } else {
      user.modifyUser( "Robert", "Górski" );
    }
  }
}
