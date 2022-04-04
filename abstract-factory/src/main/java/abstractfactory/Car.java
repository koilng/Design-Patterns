package src.main.java.abstractfactory;


public class Car {

  private Body body;
  private Engine engine;
  private Tyres tyres;

  public Body getBody() {
    return body;
  }

  public void setBody(Body body) {
    this.body = body;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Tyres getTyres() {
    return tyres;
  }

  public void setTyres(Tyres tyres) {
    this.tyres = tyres;
  }

  public static class FactoryMaker {

    public enum CarType {SEDAN, HATCHBACK, UNIVERSAL}

    public static CarFactory makeFactory(CarType type) {
      switch (type) {
        case SEDAN -> {
          return new SedanCarFactory();
        }
        case HATCHBACK -> {
          return new HatchbackCarFactory();
        }
        case UNIVERSAL -> {
          return new UniversalCarFactory();
        }
        default -> throw new IllegalArgumentException();
      }
    }
  }
}
