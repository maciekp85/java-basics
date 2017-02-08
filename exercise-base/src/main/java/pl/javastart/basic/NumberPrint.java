package pl.javastart.basic;

/**
 * Created by nishi on 2017-02-08.
 */
public class NumberPrint {

  void printNumber(int a) {
    System.out.println(a);
  }

  void printNumber(int a, int b) {
    printNumber( a );
    System.out.println(b);
  }
  
  void printNumber(int a, int b, int c) {
    printNumber( a, b );
    System.out.println(c);
  }
}
