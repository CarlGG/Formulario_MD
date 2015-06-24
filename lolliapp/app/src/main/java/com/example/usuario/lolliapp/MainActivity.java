package com.example.usuario.lolliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void  onclic(View view){
        EditText edad,nombre;
        DatePicker fecha;
       RadioButton sM,sF;
        String sexo = null;

        nombre = (EditText) findViewById(R.id.editText);
        edad = (EditText) findViewById(R.id.editTextEdad);
        fecha = (DatePicker) findViewById(R.id.fecha);

        sM = (RadioButton) findViewById(R.id.Masculino);
        sF = (RadioButton) findViewById(R.id.Femenino);


        textView = (TextView) findViewById(R.id.textView);



        if (sM.isChecked()==true) {
            sexo = "Masculino";
        }
        if(sF.isChecked()==true){
            sexo = "Femenino";
        }

       //textView.setText("hola " + sexo);
        String f = fecha.getDayOfMonth()+"/"+fecha.getMonth()+"/"+fecha.getYear();

      Intent i = new Intent(this,MainActivity2Activity.class);
        i.putExtra("nombre",nombre.getText().toString());
        i.putExtra("edad",edad.getText().toString());
        i.putExtra("fecha",f);
        i.putExtra("sexo",sexo);
       startActivity(i);

    }



}
