package src.main.java.abstractfactory;

public class UniversalBody implements Body {
  private final String DESCRIPTION = "This is UniversalBody";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
