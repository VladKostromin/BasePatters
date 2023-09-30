package main.java.com.vlad_kostromin.basepatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
     //   File file = new SomeFile("some_file.txt");
        File proxyFile = new FileProxy("file_with_text.txt");

        //proxyFile.read();
    }
}
