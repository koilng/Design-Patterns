package src.main.java.prototype;

import java.util.Objects;

public class Book implements Prototype {

  private final int pages;
  private final String name;

  public Book(int pages, String name) {
    this.pages = pages;
    this.name = name;
  }

  @Override
  public Book copy() {
    Book copy = new Book(pages, name);
    return copy;
  }

  @Override
  public String toString() {
    return "Book{" +
        "pages=" + pages +
        ", name='" + name + '\'' +
        '}';
  }
}
