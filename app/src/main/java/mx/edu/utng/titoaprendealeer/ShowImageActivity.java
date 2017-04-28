package mx.edu.utng.titoaprendealeer;

/**
 * Created by ulises on 18/04/2017.
 */
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ShowImageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        String title = getIntent().getStringExtra("title");
        Bitmap bitmap = getIntent().getParcelableExtra("image");

        ImageView ivShowPhoto = (ImageView)findViewById(R.id.iv_show_photo);
        ivShowPhoto.setImageBitmap(bitmap);
    }
}
