package src.main.java.factory;

public class SteelIngot implements Ingot{

  private final String DESCRIPTION = "This is steel ingot";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
