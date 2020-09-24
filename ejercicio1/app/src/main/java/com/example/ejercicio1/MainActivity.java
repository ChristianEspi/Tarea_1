package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView saludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saludo = (TextView)findViewById(R.id.txt_Hola);
        findViewById(R.id.button);
    }
    public void ocultar(View v){
        if(saludo.getVisibility() == View.GONE){
            saludo.setVisibility(View.VISIBLE);
        }else{
            saludo.setVisibility(View.GONE);
        }
    }
}