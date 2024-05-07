package patterns.template;

public class ElectricCar extends CarCreationTemplate {

  public void handlePayment() {
    System.out.println("Handling payment of $100,000 dollars.");
  }

  public void assembleCar() {
    System.out.println("Installing the batteries...");
  }

  public Boolean handleDelivery(Boolean toDeliver) {
    System.out.println("Handling delivery for customer");
    if (toDeliver) {
      System.out.println("Delivering to your address.");
      return true;
    } else {
      System.out.println("Car will be picked up at dealer.");
      return false;
    }
  }
}
