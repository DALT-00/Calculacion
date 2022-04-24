package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private EditText ed2;
    private EditText ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        ed3 = (EditText)findViewById(R.id.ed3);
    }
    // Metodo de enviar de boton
    public void Enviar (View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("Nombre", ed1.getText().toString());
        i.putExtra("Apellido", ed2.getText().toString());
        i.putExtra("Sueldo", ed3.getText().toString());
        startActivity(i);
    }
}