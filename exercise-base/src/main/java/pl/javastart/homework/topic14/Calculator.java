package pl.javastart.homework.topic14;

/**
 * Created by nishi on 2017-02-28.
 */
public class Calculator {

  private static final String ADD = "+";
  private static final String SUB = "-";
  private static final String MULTI = "*";
  private static final String DIV = "/";

  public double calculate(double number1, double number2, String operator) {

    double result = 0;

    switch (operator) {
      case ADD:
        result = number1 + number2;
        break;
      case SUB:
        result = number1 - number2;
        break;
      case MULTI:
        result = number1 * number2;
        break;
      case DIV:
        result = number1 / number2;
        break;
      default:
        System.out.println("Wrong operator.");
    }

    return result;
  }

}
