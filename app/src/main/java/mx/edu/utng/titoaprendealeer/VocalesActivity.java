package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class VocalesActivity extends AppCompatActivity {
    MediaPlayer mp;
    private ImageButton bt_button1;
    private ImageButton bt_button2;
    private ImageButton bt_button3;
    private ImageButton bt_button4;
    private ImageButton bt_button5;
    private ImageButton bt_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vocales_main);

        bt_button1 = (ImageButton) findViewById(R.id.bt_button1);
        bt_button2 = (ImageButton) findViewById(R.id.bt_button2);
        bt_button3 = (ImageButton) findViewById(R.id.bt_button3);
        bt_button4 = (ImageButton) findViewById(R.id.bt_button4);
        bt_button5 = (ImageButton) findViewById(R.id.bt_button5);
        bt_go = (ImageButton)findViewById(R.id.btn_carrucel);



        bt_go.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(VocalesActivity.this, CarrucelActivity.class));
            }
        });

        bt_button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(VocalesActivity.this, R.raw.letra_a);

                mp.start();
            }

        });

        bt_button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(VocalesActivity.this, R.raw.letra_e);
                mp.start();
            }

        });

        bt_button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(VocalesActivity.this, R.raw.letra_i);
                mp.start();
            }

        });
        bt_button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(VocalesActivity.this, R.raw.letra_o);
                mp.start();
            }

        });
        bt_button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(VocalesActivity.this, R.raw.letra_u);
                mp.start();
            }


        });


    }


}
