package main.java.com.vlad_kostromin.basepatterns.behavioral.visitor;

public class DocumentUser implements DocumentVisitor {

    @Override
    public void visit(DocumentElement element) {
        if(element instanceof Paragraph) {
            ((Paragraph) element).addContent("This is a paragraph.");
        } else if (element instanceof Image) {
            ((Image) element).setImage("Image source: some_image.jpg");
        }
    }
}
