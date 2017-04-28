package mx.edu.utng.titoaprendealeer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageButton;

/**
 * Created by ulises on 06/04/2017.
 */

public class ColoresActivity extends ActionBarActivity {
    private ImageButton bt_azul;
    private ImageButton bt_verde;
    private ImageButton bt_rojo;
    private ImageButton bt_morado;
    private ImageButton bt_anaranjado;
    private ImageButton bt_blanco;
    private ImageButton bt_negro;
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coores_main);
        bt_azul = (ImageButton)findViewById(R.id.bt_azul);
        bt_anaranjado = (ImageButton)findViewById(R.id.bt_anaranjado);
        bt_rojo = (ImageButton)findViewById(R.id.bt_rojo);
        bt_morado = (ImageButton)findViewById(R.id.bt_morado);
        bt_blanco = (ImageButton)findViewById(R.id.bt_blanco);
        bt_negro = (ImageButton)findViewById(R.id.bt_negro);
        bt_verde = (ImageButton)findViewById(R.id.bt_verde);
    }
}
