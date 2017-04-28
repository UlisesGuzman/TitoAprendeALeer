package mx.edu.utng.titoaprendealeer;

/**
 * Created by ulises on 25/04/2017.
 */

public class ImageItemNumeros {

    private int id;
    private String description;

    public ImageItemNumeros(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public ImageItemNumeros(){
        this(0,"");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ImageItemNumeros{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
