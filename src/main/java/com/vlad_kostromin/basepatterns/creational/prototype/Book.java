package main.java.com.vlad_kostromin.basepatterns.creational.prototype;

public class Book implements Copyable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setName(String name) {
        this.title = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public Object copy() {
        Book copyBook = new Book(title, author);
        return copyBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
