package src.main.java.abstractfactory;

public class HatchbackCarFactory implements CarFactory {

  @Override
  public Body createBody() {
    return new HatchbackBody();
  }

  @Override
  public Engine createEngine() {
    return new HatchbackEngine();
  }

  @Override
  public Tyres createTyres() {
    return new HatchbackTyres();
  }
}
