package main.java.com.vlad_kostromin.basepatterns.behavioral.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor documentVisitor);
}
