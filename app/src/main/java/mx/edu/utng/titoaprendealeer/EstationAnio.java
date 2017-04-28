package mx.edu.utng.titoaprendealeer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class EstationAnio extends AppCompatActivity {
    MediaPlayer mp;
    private ImageButton bt_button1;
    private ImageButton bt_button2;
    private ImageButton bt_button3;
    private ImageButton bt_button4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estation_main);

        bt_button1=(ImageButton)findViewById(R.id.bt_button1);
        bt_button2=(ImageButton)findViewById(R.id.bt_button2);
        bt_button3=(ImageButton)findViewById(R.id.bt_button3);
        bt_button4=(ImageButton)findViewById(R.id.bt_button4);

        bt_button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(EstationAnio.this, R.raw.primavera);

                mp.start();
            }

        });

        bt_button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(EstationAnio.this, R.raw.verano);

                mp.start();
            }

        });

        bt_button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(EstationAnio.this, R.raw.otonio);

                mp.start();
            }

        });

        bt_button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(EstationAnio.this, R.raw.invierno);

                mp.start();
            }

        });
    }
}

