package com.example.mostrardatosenotraactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
    }

    //Metodo para el boton enviar
    public void Enviar(View view){
        Intent i=new Intent(this,MainActivity2.class);
        //Al cambiar de Activity lleva este valor
        i.putExtra("dato",et1.getText().toString());
        startActivity(i);
    }
}