package src.main.java.factory;

public class Main {

  public static void main(String[] args) {
    var goldIngot = IngotFactory.getIngot(IngotType.GOLD);
    System.out.println(goldIngot.hashCode());
    var goldIngot2 = IngotFactory.getIngot(IngotType.GOLD);
    System.out.println(goldIngot2.hashCode());
  }
}
