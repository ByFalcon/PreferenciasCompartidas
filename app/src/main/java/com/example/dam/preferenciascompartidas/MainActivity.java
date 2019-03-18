package com.example.dam.preferenciascompartidas;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String usuario = "usuario";
        String predeterminado = "anonimo";
        SharedPreferences pc;
        pc = getSharedPreferences(usuario, Context.MODE_PRIVATE);

        //lectura
        String usuarioPreferencia = pc.getString(usuario, predeterminado);
        Log.v("TAG", usuarioPreferencia);

        if(usuarioPreferencia.equals(predeterminado)){
            //escritura
            SharedPreferences.Editor ed = pc.edit();
            ed.putString(usuario, "user");
            ed.commit();
            Log.v("TAG", "guardado");
        }

    }
}
