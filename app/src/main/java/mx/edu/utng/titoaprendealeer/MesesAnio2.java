package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MesesAnio2 extends AppCompatActivity {
    MediaPlayer mp;
    private ImageButton bt_button1;
    private ImageButton bt_button2;
    private ImageButton bt_button3;
    private ImageButton bt_button4;
    private ImageButton bt_button5;
    private ImageButton bt_button6;
    private Button bt_Comeback;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meses_main);

        bt_button1 = (ImageButton) findViewById(R.id.bt_button1);
        bt_button2 = (ImageButton) findViewById(R.id.bt_button2);
        bt_button3 = (ImageButton) findViewById(R.id.bt_button3);
        bt_button4 = (ImageButton) findViewById(R.id.bt_button4);
        bt_button5 = (ImageButton) findViewById(R.id.bt_button5);
        bt_button6 = (ImageButton) findViewById(R.id.bt_button6);





        bt_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio2.this, R.raw.julio);

                mp.start();
            }

        });

        bt_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio2.this, R.raw.agosto);

                mp.start();
            }

        });

        bt_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio2.this, R.raw.septiembre);

                mp.start();
            }

        });

        bt_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}