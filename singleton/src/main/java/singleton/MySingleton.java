package src.main.java.singleton;

public final class MySingleton {
  private static MySingleton instance;

  private MySingleton() {
  }

  public static MySingleton getInstance() {
    if (instance == null) {
      instance = new MySingleton();
    }
    return instance;
  }
}
