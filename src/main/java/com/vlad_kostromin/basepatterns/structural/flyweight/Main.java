package main.java.com.vlad_kostromin.basepatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        ImageFlyweightFactory iff = new ImageFlyweightFactory();

        Image firstImage = iff.getImage("image1.jpg");
        Image secondImage = iff.getImage("image2.jpg");
        Image thirdImage = iff.getImage("image1.jpg");

        firstImage.display(20, 30);
        secondImage.display(40, 50);
        thirdImage.display(60, 70);
        System.out.println(firstImage);
        System.out.println(secondImage);
        System.out.println(thirdImage);
    }
}
