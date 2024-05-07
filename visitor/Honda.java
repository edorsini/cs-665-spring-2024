package patterns.visitor;

public class Honda implements Car {
  private int speed = 90;

  public int getSpeed() {
    return this.speed;
  }

  @Override
  public String goFast() {
    return "This car goes 90 MPH!";
  }

  @Override
  public void accept(CarVisitor carVisitor) {  // <-- Needed for the Visitor Pattern
    carVisitor.visit(this);
  } // important!
}
