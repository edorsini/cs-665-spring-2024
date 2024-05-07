package patterns.visitor;

/**
 * "The Visitor Pattern allows you to define a new operation without changing the classes of the
 * elements on which it operates.  It represents an operation to be performed on the elements of
 * an object structure." -- Gamma et al.
 */

public class Main {

  public static void main(String[] args) {

    Car myCar = new Honda();
    System.out.println(myCar.goFast());

//    Booster2x booster test = new Booster2x();
//    booster.visit(myCar);

    myCar.accept(new Booster2x());
    myCar.accept(new Booster3x());

  }
}
