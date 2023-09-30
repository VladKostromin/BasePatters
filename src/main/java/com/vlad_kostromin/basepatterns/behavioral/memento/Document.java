package main.java.com.vlad_kostromin.basepatterns.behavioral.memento;

import java.util.Date;

public class Document {
    private String docText;
    private Date date;

    public void createDocument(String text) {
        this.docText = text;
        this.date = new Date();
    }

    public SaveDocument saveDocument() {
        return new SaveDocument(docText);
    }

    public void loadDocument(SaveDocument saveDocument) {
        docText = saveDocument.getDocText();
        date = saveDocument.getDate();
    }

    @Override
    public String toString() {
        return "Paagraph{" +
                "docText='" + docText + '\'' +
                ", date=" + date +
                '}';
    }
}
