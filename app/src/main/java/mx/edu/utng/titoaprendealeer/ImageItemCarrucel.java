package mx.edu.utng.titoaprendealeer;

/**
 * Created by ulises on 18/04/2017.
 */
import android.graphics.Bitmap;

public class ImageItemCarrucel {
    private Bitmap image;
    private String title;


    public ImageItemCarrucel(Bitmap image, String title) {
        this.image = image;
        this.title = title;
    }

    public ImageItemCarrucel() {
        this(null, "");
    }

    public Bitmap getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}