package src.main.java.abstractfactory;

public class UniversalEngine implements Engine {
  private final String DESCRIPTION = "This is UniversalEngine";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
