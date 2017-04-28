package mx.edu.utng.titoaprendealeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btLogin;
    private Button btRegistrar;
    private EditText etNombre;
    private EditText etPass;
    private DBHelper db;
    private Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        db = new DBHelper(this);
        session = new Session(this);
        btLogin = (Button)findViewById(R.id.bt_login);
        btRegistrar = (Button)findViewById(R.id.bt_registrar);
        etNombre = (EditText) findViewById(R.id.et_nombre);
        etPass = (EditText) findViewById(R.id.et_password);
        btLogin.setOnClickListener(this);
        btRegistrar.setOnClickListener(this);


        if (session.loggedin()){
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
            finish();
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_login:
                login();
                break;

            case R.id.bt_registrar:
                startActivity(new Intent(LoginActivity.this, Registro.class));
                break;
            default:
        }
    }

    private void login(){
        String email = etNombre.getText().toString();
        String pass = etPass.getText().toString();

        if (db.getUser(email, pass)){
            session.setLoggedin(true);
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Escriba nombre/password", Toast.LENGTH_SHORT).show();
        }
    }
}
