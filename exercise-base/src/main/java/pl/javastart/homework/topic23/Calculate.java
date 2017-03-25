package pl.javastart.homework.topic23;

/**
 * Created by nishi on 2017-03-25.
 */
public class Calculate {

  private final String ADD = "+";
  private final String SUB = "-";
  private final String DIV = "/";
  private final String MULTI = "*";
  private final String EXIT = "exit";

  private boolean exit;
  private double result;

  public boolean isExit() {
    return exit;
  }

  public void setExit(boolean exit) {
    this.exit = exit;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public Calculate() {
    setExit( false );
    setResult( 0.0 );
  }

  public double add(double number1, double number2) {
    return number1 + number2;
  }

  public double sub(double number1, double number2) {
    return number1 - number2;
  }

  public double div(double number1, double number2) throws ArithmeticException {
    if (number2 == 0)
      throw new ArithmeticException( "You can not divide by zero!" );

    return number1 / number2;
  }

  public double multi(double number1, double number2) {
    return number1 * number2;
  }

  public double calculate(String operation, double number1, double number2) throws UnknownOperatorException {
    switch (operation) {
      case ADD:
        setResult( add( number1, number2 ));
        break;
      case SUB:
        setResult( sub( number1, number2 ));
        break;
      case DIV:
        setResult( div( number1, number2 ));
        break;
      case MULTI:
        setResult( multi( number1, number2 ));
        break;
      case EXIT:
        setExit( true );
        break;
      default:
        throw new UnknownOperatorException( "Wrong operation. Try again" );
    }
    return getResult();
  }

}
