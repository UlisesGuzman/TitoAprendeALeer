package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity implements View.OnClickListener{
    private Button btRegistrar;
    private TextView tvLogin;
    private EditText etEmail;
    private EditText etPass;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        db = new DBHelper(this);
        btRegistrar = (Button) findViewById(R.id.bt_registrar);
        tvLogin = (TextView)findViewById(R.id.et_email);
        etEmail = (EditText)findViewById(R.id.et_email);
        etPass = (EditText)findViewById(R.id.et_password);

        btRegistrar.setOnClickListener(this);
        tvLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_registrar:
                register();
                break;
            case R.id.bt_login:
                startActivity(new Intent(Registro.this, LoginActivity.class));
                finish();
                break;
            default:
        }
    }

    private void register(){
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();
        if (email.isEmpty() && pass.isEmpty()){
            displayToast("Username/password fiel empty");
        }else{
            db.addUser(email,pass);
            displayToast("Usuaro registrado");
            finish();
        }

    }

    private void displayToast(String message){
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
    }
}