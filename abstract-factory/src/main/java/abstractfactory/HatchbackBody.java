package src.main.java.abstractfactory;

public class HatchbackBody implements Body{
  private final String DESCRIPTION = "This is HatchbackBody";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
