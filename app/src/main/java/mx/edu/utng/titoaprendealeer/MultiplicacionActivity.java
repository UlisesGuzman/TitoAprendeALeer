package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Toshiba on 19/01/2017.
 */
public class MultiplicacionActivity extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button btnCalculate;
    private TextView txvResult;
    private ImageButton ibRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplicacion_main);
        edtNumber1 = (EditText)findViewById(R.id.edt_number_1);
        edtNumber2 = (EditText)findViewById(R.id.edt_number_2);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        txvResult = (TextView)findViewById(R.id.txv_result);
        ibRegresar = (ImageButton)findViewById(R.id.ib_regresar);

        ibRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regresar = new Intent(MultiplicacionActivity.this, OperacionesActivity.class);
                startActivity(regresar);
            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(edtNumber1.getText().toString());
                float number2 = Float.parseFloat(edtNumber2.getText().toString());
                float result = 0;

                result = number1 * number2;


                txvResult.setText(""+result);
            }


        });


    }
}

