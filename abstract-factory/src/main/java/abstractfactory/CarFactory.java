package src.main.java.abstractfactory;

public interface CarFactory {
  Body createBody();
  Engine createEngine();
  Tyres createTyres();
}
