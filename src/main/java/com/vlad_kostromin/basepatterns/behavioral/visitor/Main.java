package main.java.com.vlad_kostromin.basepatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        DocumentElement paragraph = new Paragraph();
        DocumentElement image= new Image();

        DocumentVisitor user = new DocumentUser();

        paragraph.accept(user);
        image.accept(user);
    }
}
