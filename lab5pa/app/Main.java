package lab5pa.app;

import lab5pa.model.ImageItem;
import lab5pa.repository.ImageRepository;
import lab5pa.exception.ImageException;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImageRepository repo = new ImageRepository();

        ImageItem image = new ImageItem("mjolnir", LocalDate.of(2004, 2, 3), List.of("thor", "dedeman"), Path.of("C:/Users/Cosmin PC/Desktop/da/mjolnir.png"));

        try {
            repo.addImage(image);
            repo.displayImage(image);
        } catch (ImageException exception) {
            System.err.println("Eroare - " + exception.getMessage());
        }
    }
}
