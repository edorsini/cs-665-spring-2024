package patterns.adapter;

/**
 * This is the Adaptee
 */
public class FerrariCharger implements CigaretteLighterCharger {
  public void chargeViaCarLighter() {  // <-- specificRequest()
    System.out.println("My phone is now charging via my car...");
  }
}
