package com.example.mostrardatosenotraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=(TextView) findViewById(R.id.tv);

        //Recupera el valor del otro Activity
        String dato=getIntent().getStringExtra("dato");
        //Muestra la frase en el TextView
        tv.setText("Hola "+dato);
    }

    //Metodo para regresar
    public void Regresar(View vie){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}