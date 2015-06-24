package com.example.usuario.lolliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        //TextView tv_contenido = (TextView) findViewById(R.id.tv_contenido);

       // TextView edad,nombre,fecha,genero;

        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView edad = (TextView) findViewById(R.id.edad);
        TextView fecha = (TextView) findViewById(R.id.fecha);
        TextView genero = (TextView) findViewById(R.id.genero);

        Bundle parametros = getIntent().getExtras();
        String nom = parametros.getString("nombre");
        String ed = parametros.getString("edad");
        String fe = parametros.getString("fecha");
        String ge = parametros.getString("sexo");


        //tv_contenido.setText(s);

        nombre.setText(nom);
        edad.setText(ed);
        fecha.setText(fe);
        genero.setText(ge);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
