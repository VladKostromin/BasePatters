package main.java.com.vlad_kostromin.basepatterns.behavioral.memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Document document = new Document();
        document.createDocument("First text in document");
        System.out.println(document);
        SaveDocument savedDocument = document.saveDocument();
        System.out.println("Paagraph are saved");
        Thread.sleep(3000);

        document.createDocument("This is updated document");
        System.out.println(document);


        document.loadDocument(savedDocument);
        System.out.println("Restored document: " + document);

    }
}
