package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 12.05.2016.
 */
public class ImageReaderFactory {
    public static Map<ImageTypes, ImageReader> map = new HashMap<>();

    static {
        map.put(ImageTypes.BMP, new BmpReader());
        map.put(ImageTypes.JPG, new JpgReader());
        map.put(ImageTypes.PNG, new PngReader());
    }


    public static ImageReader getReader(ImageTypes type) {
        if (map.containsKey(type)) {
            return map.get(type);
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
