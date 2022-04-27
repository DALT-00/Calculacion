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

    private TextView tv10;
    private TextView tv11;


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

        tv10 = (TextView)findViewById(R.id.tv10);
        tv11 = (TextView)findViewById(R.id.tv11);

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
        double isr;
        double bono;
        if (liquido <= 5000){
            bono = (liquido*0.05);
        }
        else if ( liquido <= 10000){
            bono = (liquido*0.07);
        }
        else if(liquido <= 25000){
            bono=(liquido*0.12);
        }
        else{
            bono = 0;
        }

        if (liquido >4900){
            isr = ((liquido * 5)/100);
        }else {
            isr = 0;
        }


        double st = liquido-(igss + irtra + intecap + isr);


        String Igss = String.valueOf(igss);
        tv4.setText("Total a pagar  igss es "+ Igss);
        String Irtra = String.valueOf(irtra);
        tv5.setText("Total a pagar  Irtra es "+Irtra);
        String Intecap = String.valueOf(intecap);
        tv6.setText("Total a pagar  Intecap es "+Intecap);
        String Isr = String.valueOf(isr);
        tv7.setText("Total a pagar  Isr es "+Isr);
        String R = String.valueOf(st);
        tv10.setText("Su sueldo total es: "+R);
        String BN = String.valueOf(bono);
        tv11.setText("El bono es: "+BN);

    }

    //Metodo del boton

    public void Regresar (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}

