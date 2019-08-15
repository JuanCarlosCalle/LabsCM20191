package co.edu.udea.compumovil.gr02_20191.lab1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.view.View;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class bebidas extends AppCompatActivity {

    private static final String KEY_NOMBREBEBIDA="nombreBebida_key";
    private static final String KEY_PRECIO="precio_key";
    private static final String KEY_INGREDIENTES="ingredientes_key";


    ImageView imagen;
    Button buttonAgregarimagen,buttonGuardar,buttonLimpiar;
    private EditText editText_nombrebebida,editPrecio,editText_Ingredientesbebida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
        editText_nombrebebida=(EditText) findViewById(R.id.editText_nombrebebida);
        editText_Ingredientesbebida = (EditText) findViewById(R.id.editText_Ingredientesbebida);
        editPrecio = (EditText) findViewById(R.id.editPrecio);
        buttonAgregarimagen=(Button) findViewById(R.id.buttonAgregarimagen);
        buttonGuardar=(Button) findViewById(R.id.buttonGuardar);
        buttonLimpiar=(Button) findViewById(R.id.buttonLimpiar);
        imagen=(ImageView) findViewById(R.id.imagenbebida);

        if(savedInstanceState!=null){
            String savedname=savedInstanceState.getString(KEY_NOMBREBEBIDA);
            editText_nombrebebida.setText(savedname);

            String savedprecio=savedInstanceState.getString(KEY_PRECIO);
            editPrecio.setText(savedprecio);

            String savedingredientes=savedInstanceState.getString(KEY_INGREDIENTES);
            editText_Ingredientesbebida.setText(savedingredientes);


        }else {
            Toast.makeText(this,"New entry",Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    public void onclick(View view){

        cargarImagen();
    }

    private void cargarImagen() {
        Intent intent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione Aplicacion"),10);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path=data.getData();
            imagen.setImageURI(path);
        }
    }

    public void GuardarDatos(View view){
        String Nombre = editText_nombrebebida.getText().toString();


    }


}
