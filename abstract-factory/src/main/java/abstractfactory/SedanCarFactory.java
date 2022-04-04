package src.main.java.abstractfactory;

public class SedanCarFactory implements CarFactory {

  @Override
  public Body createBody() {
    return new SedanBody();
  }

  @Override
  public Engine createEngine() {
    return new SedanEngine();
  }

  @Override
  public Tyres createTyres() {
    return new SedanTyres();
  }
}
