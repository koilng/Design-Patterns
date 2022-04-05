package src.main.java.factory;

import java.util.function.Supplier;

public enum IngotType {
  GOLD(GoldIngot::new),
  STEEL(SteelIngot::new);

  private final Supplier<Ingot> constructor;

  IngotType(Supplier<Ingot> constructor) {
    this.constructor = constructor;
  }

  public Supplier<Ingot> getConstructor() {
    return constructor;
  }
}
