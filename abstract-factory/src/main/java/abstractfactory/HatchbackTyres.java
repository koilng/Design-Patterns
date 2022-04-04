package src.main.java.abstractfactory;

public class HatchbackTyres implements Tyres {
  private final String DESCRIPTION = "This is HatchbackTyres";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
