package patterns.decorator.coffeemachine;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class Main {
  public Main() throws IOException {
  }

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    Beverage beverage2 = new Milk(beverage);
    beverage2 = new Milk(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
  }




  FileInputStream fis = new FileInputStream("input.txt");
  // We want speed, so let's buffer it in memory:
  BufferedInputStream bis = new BufferedInputStream(fis);
  // The file is gzipped, so we need to un-gzip it:
  GZIPInputStream gis = new GZIPInputStream(bis);
  // We need to un-serialize those Java objects
  ObjectInputStream ois = new ObjectInputStream(gis);




}