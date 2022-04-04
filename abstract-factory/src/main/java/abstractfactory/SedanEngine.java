package src.main.java.abstractfactory;

public class SedanEngine implements Engine {

  private final String DESCRIPTION = "This is SedanEngine";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
