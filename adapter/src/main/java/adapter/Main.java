package src.main.java.adapter;

public class Main {

  public static void main(String[] args) {
    Database database = new AdapterJavaToDatabase();

    database.insert();
    database.update();
    database.select();
    database.remove();
  }

}
