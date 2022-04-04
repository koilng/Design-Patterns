package src.main.java.abstractfactory;

public class UniversalCarFactory implements CarFactory {

  @Override
  public Body createBody() {
    return new UniversalBody();
  }

  @Override
  public Engine createEngine() {
    return new UniversalEngine();
  }

  @Override
  public Tyres createTyres() {
    return new UniversalTyres();
  }
}
