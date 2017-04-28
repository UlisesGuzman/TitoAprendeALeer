package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn_vocal;
    private ImageButton btn_alfabeto;
    private ImageButton btn_num;
    private ImageButton btn_mat;
    private ImageButton btn_examn;
    private ImageButton btn_control;
    private ImageButton btn_dia;
    private ImageButton btn_mes;
    private ImageButton btn_color;
    private ImageButton btn_estacion;
    private Button btLogout;
    private Session session;
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2_main);

        session = new Session(this);
        if (!session.loggedin()){
            logout();
        }

        btLogout = (Button)findViewById(R.id.btLogout);
        btLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        btn_vocal = (ImageButton) findViewById(R.id.btn_crear);
        btn_alfabeto = (ImageButton) findViewById(R.id.btn_alfabeto);
        btn_num = (ImageButton) findViewById(R.id.btn_num);
        btn_mat = (ImageButton) findViewById(R.id.btn_mate);
        btn_control = (ImageButton) findViewById(R.id.bt_control);
        btn_examn = (ImageButton) findViewById(R.id.btn_ejercicios);
        btn_dia = (ImageButton) findViewById(R.id.btn_dias);
        btn_mes = (ImageButton) findViewById(R.id.btn_calendario);
        btn_color = (ImageButton) findViewById(R.id.btn_colores);
        btn_estacion = (ImageButton) findViewById(R.id.btn_estaciones);



        btn_vocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VocalesActivity.class));
            }
        });


        btn_alfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AlphabetActivity.class));
            }

        });
        btn_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NumerosActivity.class));
            }

        });
        btn_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PalabraActivity.class));
            }

        });
        btn_mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OperacionesActivity.class));
            }

        });
        btn_examn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ExamenActivity.class));
            }

        });
        btn_dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DiasActivity.class));
            }

        });
        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ColoresActivity.class));
            }

        });
        btn_estacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EstationAnio.class));
            }

        });
        btn_mes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MesesAnio.class));
            }

        });


        song = MediaPlayer.create(MainActivity.this, R.raw.fondo);
        song.start();

    }

    private void logout(){
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}




