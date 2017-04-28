package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by ulises on 16/03/2017.
 */

public class OperacionesActivity extends AppCompatActivity {
    private ImageButton ibSuma;
    private ImageButton ibResta;
    private ImageButton ibMultiplicacion;
    private ImageButton ibDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operaciones_main);

        ibSuma = (ImageButton)findViewById(R.id.ib_sumar);
        ibResta = (ImageButton)findViewById(R.id.ib_restar);
        ibMultiplicacion = (ImageButton)findViewById(R.id.ib_multiplicar);
        ibDivision = (ImageButton)findViewById(R.id.ib_dividir);

        ibSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OperacionesActivity.this, SumaActivity.class));

            }
        });

        ibResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OperacionesActivity.this, RestaActivity.class));

            }
        });

        ibMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OperacionesActivity.this, MultiplicacionActivity.class));

            }
        });

        ibDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OperacionesActivity.this, DivisionActivity.class));

            }
        });

    }
}
