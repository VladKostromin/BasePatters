package main.java.com.vlad_kostromin.basepatterns.structural.proxy;

public class SomeFile implements File{
    String fileName;

    public SomeFile(String name) {
        this.fileName = name;
        loadFile(fileName);
    }

    @Override
    public void read() {
        System.out.println("Reading file: " + fileName);
    }

    private void loadFile(String fileName) {
        System.out.println("Loading file: " + fileName + " from disk...");
    }
}
