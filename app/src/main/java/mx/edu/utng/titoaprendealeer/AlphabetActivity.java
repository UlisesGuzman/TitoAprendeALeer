package mx.edu.utng.titoaprendealeer;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 15/02/2017.
 */
public class AlphabetActivity extends AppCompatActivity {

    MediaPlayer mp;
    private ImageButton bt_Button1;
    private ImageButton btButton2;
    private ImageButton btButton3;
    private ImageButton btButton4;
    private ImageButton btButton5;
    private ImageButton btButton6;
    private ImageButton btButton7;
    private ImageButton btButton8;
    private ImageButton btButton9;
    private ImageButton btButton10;
    private ImageButton btButton11;
    private ImageButton btButton12;
    private ImageButton btButton13;
    private ImageButton btButton14;
    private ImageButton btButton15;
    private ImageButton btButton16;
    private ImageButton btButton17;
    private ImageButton btButton18;
    private ImageButton btButton19;
    private ImageButton btButton20;
    private ImageButton btButton21;
    private ImageButton btButton22;
    private ImageButton btButton23;
    private ImageButton btButton24;
    private ImageButton btButton25;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_main);

        bt_Button1 = (ImageButton)findViewById(R.id.bt_button1);
        btButton2 = (ImageButton)findViewById(R.id.bt_button2);
        btButton3 = (ImageButton)findViewById(R.id.bt_button3);
        btButton4 = (ImageButton)findViewById(R.id.bt_button4);
        btButton5 = (ImageButton)findViewById(R.id.bt_button5);
        btButton6 = (ImageButton)findViewById(R.id.bt_button6);
        btButton7 = (ImageButton)findViewById(R.id.bt_button7);
        btButton8 = (ImageButton)findViewById(R.id.bt_button8);
        btButton9 = (ImageButton)findViewById(R.id.bt_button9);
        btButton10 = (ImageButton)findViewById(R.id.bt_button10);
        btButton11 = (ImageButton)findViewById(R.id.bt_button11);
        btButton12 = (ImageButton)findViewById(R.id.bt_button12);
        btButton13 = (ImageButton)findViewById(R.id.bt_button13);
        btButton14 = (ImageButton)findViewById(R.id.bt_button14);
        btButton15 = (ImageButton)findViewById(R.id.bt_button15);
        btButton16 = (ImageButton)findViewById(R.id.bt_button16);
        btButton17 = (ImageButton)findViewById(R.id.bt_button17);
        btButton18 = (ImageButton)findViewById(R.id.bt_button18);
        btButton19 = (ImageButton)findViewById(R.id.bt_button19);
        btButton20 = (ImageButton)findViewById(R.id.bt_button20);
        btButton21 = (ImageButton)findViewById(R.id.bt_button21);
        btButton22 = (ImageButton)findViewById(R.id.bt_button22);
        btButton23 = (ImageButton)findViewById(R.id.bt_button23);
        btButton24 = (ImageButton)findViewById(R.id.bt_button24);
        btButton25 = (ImageButton)findViewById(R.id.bt_button25);
        button=(Button)findViewById(R.id.btn_next);

        button.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(AlphabetActivity.this, AlphabetActivity2.class));
            }
        });

        bt_Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_a);

                mp.start();
            }

        });

        btButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_b);
                mp.start();
            }

        });

        btButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_c);
                mp.start();
            }

        });
        btButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_d);
                mp.start();
            }

        });
        btButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_e);
                mp.start();
            }
        });
        btButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_f);
                mp.start();
            }

        });
        btButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_g);
                mp.start();
            }

        });
        btButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_h);
                mp.start();
            }

        });
        btButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_i);
                mp.start();
            }

        });
        btButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_j);
                mp.start();
            }

        });
        btButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_k);
                mp.start();
            }

        });
        btButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_l);
                mp.start();
            }

        });
        btButton13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_m);
                mp.start();
            }

        });
        btButton14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_n);
                mp.start();
            }

        });
        btButton15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity.this, R.raw.letra_ene);
                mp.start();
            }

        });


    }


}
