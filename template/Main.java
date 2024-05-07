package patterns.template;

public class Main {

  public static void main(String[] args) {
    CarCreationTemplate ferrari = new ImageofACar();
    CarCreationTemplate tesla = new ElectricCar();
    CarCreationTemplate nissanSkyline = new MatchBoxCar();

    // executing the patterns.template method for each object with their unique implementations.
    ferrari.createCar( "red");
    System.out.println("----------");
    tesla.createCar( "blue");
    System.out.println("----------");
    nissanSkyline.createCar("yellow");

  }
}
