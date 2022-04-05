package src.main.java.bridge;

import java.util.Arrays;

public class Routes {

  public static void main(String[] args) {
    GpsNavigator[] navigators = {
        new DesktopNavigator(new BusDriver()),
        new PhoneNavigator(new TaxiDriver())
    };

    for (GpsNavigator navigator: navigators) {
      navigator.routeToDestination();
    }
  }
}
