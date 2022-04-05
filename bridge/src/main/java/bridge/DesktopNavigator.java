package src.main.java.bridge;

public class DesktopNavigator extends GpsNavigator{

  public DesktopNavigator(Driver driver) {
    super(driver);
  }

  @Override
  public void routeToDestination() {
    System.out.println("Desktop navigator is creating a route...");
    driver.setRoute();
  }
}
