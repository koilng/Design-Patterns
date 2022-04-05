package src.main.java.prototype;

public class Main {

  public static void main(String[] args) {
    Book book = new Book(200, "ScienceBook");
    System.out.println(book);

    BookFactory factory = new BookFactory(book);
    Book bookClone = factory.cloneBook();
    System.out.println(bookClone);
  }
}
