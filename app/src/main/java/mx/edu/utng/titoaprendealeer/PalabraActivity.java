package mx.edu.utng.titoaprendealeer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by ulises on 16/03/2017.
 */

public class PalabraActivity extends AppCompatActivity {

    LinearLayout ly_contenedor;
    private final String palabra = "PELOTA";
    private EditText controles[];
    private Button btcomparar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palabra_main);
        ly_contenedor = (LinearLayout) findViewById(R.id.ly_contenedor);
        btcomparar = (Button) findViewById(R.id.btcomparar);


        controles = new EditText[palabra.length()];
        for (int fila = 0; fila < controles.length; fila++) {
            controles[fila] = new EditText(getApplicationContext());
            controles[fila].setTextColor(Color.BLACK);
            controles[fila].setHint("N" + fila);
            ly_contenedor.addView(controles[fila]);
        }

        btcomparar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (notBlank()) {
                    if (getAllText().equals(palabra)) {
                        Toast.makeText(getApplicationContext(), "Es Correcto", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Es Incorrecto", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Llena todos los campos", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private String getAllText() {
        String respuesta = "";
        for (int i = 0; i < controles.length; i++) {
            respuesta = respuesta + controles[i].getText().toString();
        }
        return respuesta;
    }

    private Boolean notBlank() {
        boolean valor = true;
        for (int i = 0; i < controles.length; i++) {
            if (controles[i].getText().toString().isEmpty()) {
                valor = false;
                break;
            }
        }

        return valor;
    }
}