package com.example.clase5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.enlaceRegistro)).setText(Html.fromHtml("<a href='#'>Crear una nueva cuenta</a>"));
    }

    public void abrirRegistro(View view) {
        startActivity(new Intent(this, RegistroActivity.class));
    }

    public void btnIngresar(View view) {
        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextPassword = findViewById(R.id.editTextPassword);

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            if (username.isEmpty()) {
                editTextUsername.setError("No puede ser vacío");
            }
            if (password.isEmpty()) {
                editTextPassword.setError("No puede ser vacío");
            }
        } else {
            if (password.equals("123") && username.equals("pedro")) {
                startActivity(new Intent(this, NoticiaActivity.class));
                finish();
            } else {
                ((TextView) findViewById(R.id.textViewError)).setVisibility(View.VISIBLE);
            }

        }
    }
}
