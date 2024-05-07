package patterns.template;

public class ImageofACar extends CarCreationTemplate {

  public void handlePayment() {
    System.out.println("This is an image of a car.  No cost associated with this car.");
  }

  public void assembleCar() {
    System.out.println("Editing in Photoshop, right color, etc.");
  }

  public Boolean handleDelivery(Boolean toDeliver) {
    System.out.println("Handling delivery for customer");
    if (toDeliver) {
      System.out.println("Delivering to your email address.");
      return true;
    } else {
      System.out.println("Car image will be downloaded from website.");
      return false;
    }
  }

}
