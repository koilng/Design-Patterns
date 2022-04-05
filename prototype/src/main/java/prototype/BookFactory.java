package src.main.java.prototype;

public class BookFactory {
  Book book;

  public BookFactory(Book book) {
    this.book = book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  Book cloneBook() {
    return book.copy();
  }
}
