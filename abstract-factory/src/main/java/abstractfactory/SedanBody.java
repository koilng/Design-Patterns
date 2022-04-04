package src.main.java.abstractfactory;

public class SedanBody implements Body {
  private final String DESCRIPTION = "This is SedanBody";
  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
