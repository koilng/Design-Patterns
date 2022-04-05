package src.main.java.singleton;

public class Main {

  public static void main(String[] args) {
    MySingleton singleton = MySingleton.getInstance();
    MySingleton singleton1 = MySingleton.getInstance();
    System.out.println(singleton1.hashCode());
    System.out.println(singleton.hashCode());
  }
}
