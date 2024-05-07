package patterns.template;

public class MatchBoxCar extends CarCreationTemplate {

  public void handlePayment() {
    System.out.println("Handling payment of $5.99 dollars.");
  }

  public void assembleCar() {
    System.out.println("creating from plastic mold, etc.");
  }

//  public void handleDelivery(Boolean toDeliver) {
//    System.out.println("Handling delivery for customer");
//    if (toDeliver) {
//      System.out.println("Delivering to your address.");
//    } else {
//      System.out.println("Car will be picked up at the toy store.");
//    }
//  }

}
