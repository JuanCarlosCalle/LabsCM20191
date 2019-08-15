package co.edu.udea.compumovil.gr02_20191.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btingresar= (Button) findViewById(R.id.btingresar);
        btingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario=((EditText) findViewById(R.id.txtUsuario)).getText().toString();
                String pass=((EditText) findViewById(R.id.txtPass)).getText().toString();
                if (usuario.equals("admin")&& pass.equals("admin"))
                {
                    startActivity(new Intent(MainActivity.this, principal.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
