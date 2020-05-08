package com.example.clase5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        setTitle("Formulario de registro");
        ((TextView) findViewById(R.id.textViewTyC)).setText(Html.fromHtml("<a href='#'>Términos y condiciones</a>"));
    }

    public void mostrarTyC(View view){
        AlertDialog.Builder tycDialog = new AlertDialog.Builder(this);
        tycDialog.setTitle("Términos y condiciones");
        tycDialog.setMessage("Este es un mensaje de términos y condiciones");
        tycDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        tycDialog.show();
    }

    public void finalizarRegistro(View view){
        //deberiamos guardar en base de datos o ws
        EditText editTextNombre = findViewById(R.id.editTextNombre);
        String nombre = editTextNombre.getText().toString();
        if(nombre.isEmpty()){
            editTextNombre.setError("El nombre no puede ser vacío");
        }else{
            finish();
        }

    }
}
