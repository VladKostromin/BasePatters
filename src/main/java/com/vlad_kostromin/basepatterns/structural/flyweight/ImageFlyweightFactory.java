package main.java.com.vlad_kostromin.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFlyweightFactory {
    private Map<String, Image> imageMap = new HashMap<>();

    public Image getImage(String imageName) {
        Image image = imageMap.get(imageName);

        if(image == null) {
            image = new JpegImage(imageName);
            imageMap.put(imageName, image);
        }
        return image;
    }

}
