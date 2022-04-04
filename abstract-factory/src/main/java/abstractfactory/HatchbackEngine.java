package src.main.java.abstractfactory;

public class HatchbackEngine implements Engine {
  private final String DESCRIPTION = "This is HatchbackEngine";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
