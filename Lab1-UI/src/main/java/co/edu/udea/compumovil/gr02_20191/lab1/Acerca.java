package co.edu.udea.compumovil.gr02_20191.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
        findViewById(R.id.imageButton12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Acerca.this.startActivity(new Intent(Acerca.this, principal.class));
            }
        });

    }
}
