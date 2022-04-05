package src.main.java.builder;

public enum Clothes {
  TSHIRT("t-shirt"),
  SHIRT("shirt"),
  Dress("the dress");

  private final String clothes;

  Clothes(String clothes) {
    this.clothes = clothes;
  }

  @Override
  public String toString() {
    return clothes;
  }
}
