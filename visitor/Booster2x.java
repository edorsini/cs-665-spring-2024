package patterns.visitor;

public class Booster2x implements CarVisitor {
  @Override
  public void visit(Car car) {  // <-- Needed for the Visitor Pattern
    int newSpeed = car.getSpeed() * 2;
    System.out.println("This car goes " + newSpeed + " MPH!");
  }
}
