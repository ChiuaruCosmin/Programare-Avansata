package lab5pa.repository;

import lab5pa.model.ImageItem;
import lab5pa.exception.ImageException;

import java.awt.Desktop;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageRepository {
    private final List<ImageItem> images = new ArrayList<>();

    public void addImage(ImageItem image) throws ImageException {
        if (image == null) throw new ImageException("Imagine null");
        images.add(image);
    }

    public void displayImage(ImageItem image) throws ImageException {
        if (image == null) throw new ImageException("Imagine null");
        if (!image.path().toFile().exists()) throw new ImageException("Fisierul nu exista");

        try {
            Desktop.getDesktop().open(image.path().toFile());
        } catch (IOException e) {
            throw new ImageException("Nu s-a putut deschide imaginea" + e.getMessage());
        }
    }

    public List<ImageItem> getImages() {
        return images;
    }
}
