package main.java.com.vlad_kostromin.basepatterns.structural.proxy;

public class FileProxy implements File{
    private String fileName;
    private SomeFile someFile;

    public FileProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        if(someFile == null) {
            someFile = new SomeFile(fileName);
        }
        someFile.read();
    }
}
