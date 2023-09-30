package main.java.com.vlad_kostromin.basepatterns.behavioral.memento;

import java.util.Date;

public class SaveDocument {
    private final String docText;
    private final Date date;

    public SaveDocument(String docText) {
        this.docText = docText;
        this.date = new Date();
    }

    public String getDocText() {
        return docText;
    }

    public Date getDate() {
        return date;
    }
}
