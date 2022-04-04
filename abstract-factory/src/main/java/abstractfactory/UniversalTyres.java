package src.main.java.abstractfactory;

public class UniversalTyres implements Tyres {
  private final String DESCRIPTION = "This is UniversalTyres";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
