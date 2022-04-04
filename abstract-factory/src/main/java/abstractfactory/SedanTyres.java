package src.main.java.abstractfactory;

public class SedanTyres implements Tyres {

  private final String DESCRIPTION = "This is SedanTyres";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
