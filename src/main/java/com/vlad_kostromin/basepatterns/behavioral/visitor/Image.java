package main.java.com.vlad_kostromin.basepatterns.behavioral.visitor;

public class Image implements DocumentElement{

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
    public void setImage(String imageSource) {
        System.out.println("Image: " + imageSource);
    }
}
