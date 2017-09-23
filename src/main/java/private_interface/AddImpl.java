package private_interface;

/**
 * @author nitish on 23/9/17.
 */
public class AddImpl implements MathematicalOperation {

  public static void main(String args[]) {
    AddImpl add = new AddImpl();
    System.out.print("Addition of two number " + add.add(10,20));
    //can not use the the following method since it is private
    //additionOfTwoNumbers
  }
}
