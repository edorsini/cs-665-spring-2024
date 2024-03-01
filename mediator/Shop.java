package patterns.mediator;

import java.util.HashMap;
import java.util.Map;

public class Shop implements Mediator {

  Map<String, Driver> driverMap = new HashMap<>();
  // key is the name, value is the Driver object

  public void registerDriver(Driver d) {
    if (!driverMap.containsKey(d.getDriverName())) {
      driverMap.put(d.getDriverName(), d);
    }
  }

  public void unregisterDriver(Driver d) {
    driverMap.remove(d.getDriverName(), d);
  }

  public void notifyObservers(String driverName, float offer) {
    for (Map.Entry<String, Driver> entry : driverMap.entrySet()) {
      if (entry.getKey().equals(driverName)) {
        System.out.println(
            "No need to tell " + entry.getKey() + " that " + driverName + " changed the price");
      } else {
        System.out.println("Tell " + entry.getKey() + " that " + driverName + " changed the price");
        entry.getValue().setLastOffer(offer);
      }
    }
  }

}
