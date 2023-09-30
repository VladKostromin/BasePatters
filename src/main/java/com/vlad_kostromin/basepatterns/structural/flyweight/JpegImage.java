package main.java.com.vlad_kostromin.basepatterns.structural.flyweight;

public class JpegImage implements Image{
    private String imageName;

    public JpegImage(String imageName) {
        this.imageName = imageName;
    }


    @Override
    public void display(int x, int y) {
        System.out.println("Displaying image " + imageName + " at coordinates (" + x + ", " + y + ")");
    }
}
