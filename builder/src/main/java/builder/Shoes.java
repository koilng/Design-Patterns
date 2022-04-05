package src.main.java.builder;

public enum Shoes {
  SNEAKERS("sneakers"),
  SHOES("shoes"),
  HEELS("heels");

  private final String shoes;

  Shoes(String shoes) {
    this.shoes = shoes;
  }

  @Override
  public String toString() {
    return shoes;
  }
}
