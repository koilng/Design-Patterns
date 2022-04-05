package src.main.java.bridge;

public abstract class GpsNavigator {
  Driver driver;

  public GpsNavigator(Driver driver) {
    this.driver = driver;
  }

  public abstract void routeToDestination();
}
