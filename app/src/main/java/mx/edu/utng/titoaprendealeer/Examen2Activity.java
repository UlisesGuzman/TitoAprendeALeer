package mx.edu.utng.titoaprendealeer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

/**
 * Created by ulises on 19/03/2017.
 */

public class Examen2Activity extends AppCompatActivity {
    private ImageButton bt_1;
    private ImageButton bt_2;
    private ImageButton bt_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.examen2_main);
        bt_1 = (ImageButton) findViewById(R.id.bt_1);
        bt_2 = (ImageButton) findViewById(R.id.bt_2);
        bt_3 = (ImageButton) findViewById(R.id.bt_3);

        // bt_2.setOnClickListener(new  View.OnClickListener(){
        //   @Override
        // public void onClick(View view){
        //   startActivity(new Intent(ExamenActivity.this, Examen2Activity.class));
        //}
        //});
    }
}