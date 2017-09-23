package private_interface;

/**
 * @author nitish on 23/9/17.
 */

/**
 * This is an example for private method in interface.
 */
public interface MathematicalOperation {
  default int add(int a, int b) {
    return additionOfTwoNumbers(a, b);
  }

  private int additionOfTwoNumbers(int a, int b) {
    return a + b;
  }
}
