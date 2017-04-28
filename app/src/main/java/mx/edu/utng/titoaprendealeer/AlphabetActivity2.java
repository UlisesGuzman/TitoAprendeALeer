package mx.edu.utng.titoaprendealeer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by ulises on 16/02/2017.
 */

public class AlphabetActivity2 extends AppCompatActivity {

    MediaPlayer mp;
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
    private ImageButton btButton26;
    private ImageButton btButton27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet2_main);

        btButton16 = (ImageButton)findViewById(R.id.bt_button16);
        btButton17 = (ImageButton)findViewById(R.id.bt_button17);
        btButton18 = (ImageButton)findViewById(R.id.bt_button18);
        btButton19 = (ImageButton)findViewById(R.id.bt_button19);
        btButton20 = (ImageButton) findViewById(R.id.bt_button20);
        btButton21 = (ImageButton) findViewById(R.id.bt_button21);
        btButton22 = (ImageButton) findViewById(R.id.bt_button22);
        btButton23 = (ImageButton) findViewById(R.id.bt_button23);
        btButton24 = (ImageButton) findViewById(R.id.bt_button24);
        btButton25 = (ImageButton) findViewById(R.id.bt_button25);
        btButton26 = (ImageButton) findViewById(R.id.bt_button26);
        btButton27 = (ImageButton) findViewById(R.id.bt_button27);

        btButton21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                btButton16.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_o);
                        mp.start();
                    }

                });
                btButton17.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_p);
                        mp.start();
                    }

                });
                btButton18.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_q);
                        mp.start();
                    }

                });
                btButton19.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_r);
                        mp.start();
                    }

                });
                btButton20.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_s);
                        mp.start();
                    }

                });

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_t);
                mp.start();
            }

        });
        btButton22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_u);
                mp.start();
            }

        });
        btButton23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_v);
                mp.start();
            }

        });

        btButton24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_w);
                mp.start();
            }

        });
        btButton25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_x);
                mp.start();
            }

        });
        btButton26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_y);
                mp.start();
            }

        });
        btButton27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(AlphabetActivity2.this, R.raw.letra_z);
                mp.start();
            }

        });

    }
}


