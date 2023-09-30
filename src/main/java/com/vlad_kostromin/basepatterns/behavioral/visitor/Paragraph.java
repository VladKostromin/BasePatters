package main.java.com.vlad_kostromin.basepatterns.behavioral.visitor;

public class Paragraph implements DocumentElement{
    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }

    public void addContent(String content) {
        System.out.println("Paragraph: " + content);
    }
}
