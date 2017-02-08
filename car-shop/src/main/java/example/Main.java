package example;

/**
 * Created by nishi on 2017-02-08.
 */
public class Main {

  public static void main(String args[]) {
    Printer printer = new Printer();
    // System.out.println(printer.text); // Error, we do not have access to text field
    printer.printText();  // everything is ok, method is public
  }
}
