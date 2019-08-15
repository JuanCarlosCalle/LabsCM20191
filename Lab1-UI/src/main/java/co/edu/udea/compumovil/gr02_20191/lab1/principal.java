package co.edu.udea.compumovil.gr02_20191.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        findViewById(R.id.help).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal.this.startActivity(new Intent(principal.this, Acerca.class));
            }
        });


        findViewById(R.id.platos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal.this.startActivity(new Intent(principal.this, platos.class));
            }
        });

        findViewById(R.id.bebidas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal.this.startActivity(new Intent(principal.this, bebidas.class));
            }
        });


    }
}
