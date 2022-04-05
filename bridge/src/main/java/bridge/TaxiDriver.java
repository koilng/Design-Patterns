package src.main.java.bridge;

public class TaxiDriver implements Driver{

  @Override
  public void setRoute() {
    System.out.println("Taxi driver is setting a route");
  }
}
