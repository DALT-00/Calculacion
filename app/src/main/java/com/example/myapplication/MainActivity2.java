package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        tv10 = (TextView)findViewById(R.id.tv10);

        String dato = getIntent().getStringExtra("Nombre");
        tv1.setText("Nombre "+dato);
        String dato2 = getIntent().getStringExtra("Apellido");
        tv2.setText("Apellido "+dato2);
        String dato3 = getIntent().getStringExtra("Sueldo");
        tv3.setText("Sueldo "+dato3);

        double liquido = Double.parseDouble(dato3);
        double igss = (liquido * 4.83)/100;
        double irtra = (liquido * 1)/100;
        double intecap = (liquido * 1)/100;
        double total = (igss + irtra + intecap );
        double r = (liquido - total );
        double isr;
        if (liquido >4900){
            isr = ((liquido * 5)/100);
        }else {
            isr = 0;
        }

        String Igss = String.valueOf(igss);
        tv4.setText("Total a pagar  igss es "+ Igss);
        String Irtra = String.valueOf(irtra);
        tv5.setText("Total a pagar  Irtra es "+Irtra);
        String Intecap = String.valueOf(intecap);
        tv6.setText("Total a pagar  Intecap es "+Intecap);
        String Isr = String.valueOf(isr);
        tv7.setText("Total a pagar  Isr es "+Isr);
        String Total = String.valueOf(total);
        tv8.setText("Total a pagar servicios es "+Total);
        String R = String.valueOf(r);
        tv10.setText("Este es su sueldo total: "+R);

    }

    //Metodo del boton

    public void Regresar (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}