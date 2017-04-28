package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MesesAnio extends AppCompatActivity {
    MediaPlayer mp;
    private ImageButton bt_button1;
    private ImageButton bt_button2;
    private ImageButton bt_button3;
    private ImageButton bt_button4;
    private ImageButton bt_button5;
    private ImageButton bt_button6;
    private ImageButton bt_button7;
    private ImageButton bt_button8;
    private ImageButton bt_button9;
    private ImageButton bt_button10;
    private ImageButton bt_button11;
    private ImageButton bt_button12;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meses_main);

        bt_button1=(ImageButton)findViewById(R.id.bt_button1);
        bt_button2=(ImageButton)findViewById(R.id.bt_button2);
        bt_button3=(ImageButton)findViewById(R.id.bt_button3);
        bt_button4=(ImageButton)findViewById(R.id.bt_button4);
        bt_button5=(ImageButton)findViewById(R.id.bt_button5);
        bt_button6=(ImageButton)findViewById(R.id.bt_button6);
        bt_button7=(ImageButton)findViewById(R.id.bt_button7);
        bt_button8=(ImageButton)findViewById(R.id.bt_button8);
        bt_button9=(ImageButton)findViewById(R.id.bt_button9);
        bt_button10=(ImageButton)findViewById(R.id.bt_button10);
        bt_button11=(ImageButton)findViewById(R.id.bt_button11);
        bt_button12=(ImageButton)findViewById(R.id.bt_button12);
        button=(Button)findViewById(R.id.btn_next);



        bt_button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.enero);

                mp.start();
            }

        });

        bt_button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.febrero);

                mp.start();
            }

        });

        bt_button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.marzo);

                mp.start();
            }

        });

        bt_button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.abril);

                mp.start();
            }

        });
        bt_button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.mayo);

                mp.start();
            }

        });
        bt_button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.junio);

                mp.start();
            }

        });
        bt_button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.julio);

                mp.start();
            }

        });

        bt_button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.agosto);

                mp.start();
            }

        });

        bt_button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.septiembre);

                mp.start();
            }

        });
        bt_button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.octubre);

                mp.start();
            }

        });
        bt_button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.noviembre);

                mp.start();
            }

        });
        bt_button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MesesAnio.this, R.raw.diciembre);

                mp.start();
            }

        });

    }
}
