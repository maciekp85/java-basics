package pl.javastart.library.app;

/**
 * Created by nishi on 2017-02-07.
 */
public class LibraryApp {

  public static void main(String args[]) {
    final String appName = "LibraryApp v0.92\n";

    System.out.println(appName);
    LibraryControl libControl = new LibraryControl();
    libControl.controlLoop();
  }
}
