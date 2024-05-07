package patterns.template;

public abstract class CarCreationTemplate {


    public abstract void handlePayment();

    public abstract void assembleCar();

    public Boolean handleDelivery(Boolean delivery) {
         // default to true (subclasses can change if needed)
        System.out.println("from parent..");
         return delivery;
    }

    // This is the Template Method
    public final void createCar(String color) {
        handlePayment();
        assembleCar();
        handleDelivery(true); // <!-- this is the patterns.template hook!
    }
}
