package src.main.java.factory;

public class IngotFactory {

  public static Ingot getIngot(IngotType type) {
    return type.getConstructor().get();
  }
}
