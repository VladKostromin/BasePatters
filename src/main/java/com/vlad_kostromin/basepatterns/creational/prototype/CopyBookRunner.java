package main.java.com.vlad_kostromin.basepatterns.creational.prototype;

public class CopyBookRunner {
    public static void main(String[] args) {
        Book gamesOfThrones = new Book("Games of Thrones", "George R.R. Martin");

        System.out.println(gamesOfThrones);

        BookFactory factory = new BookFactory(gamesOfThrones);

        Book cloneOfGOTBook = factory.cloneBook();

        System.out.println("====================");
        System.out.println(cloneOfGOTBook);
    }
}
