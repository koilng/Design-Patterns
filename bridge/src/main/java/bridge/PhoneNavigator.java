package src.main.java.bridge;

public class PhoneNavigator extends GpsNavigator{

  public PhoneNavigator(Driver driver) {
    super(driver);
  }

  @Override
  public void routeToDestination() {
    System.out.println("Phone navigator is creating a route...");
    driver.setRoute();
  }
}
