package src.main.java.factory;

public class GoldIngot implements Ingot {
  private final String DESCRIPTION = "This is gold ingot";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
