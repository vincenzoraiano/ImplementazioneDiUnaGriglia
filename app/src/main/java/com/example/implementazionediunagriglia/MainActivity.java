package com.example.implementazionediunagriglia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Object View;

    //creazione del metodo del testo submit
    public void submit(View view){

        //creo una variabile di tipo edittext per l'inserimento della password.
        EditText username=(EditText) findViewById(R.id.nameId);
        //log per controllare l'inserimento del nome
        Log.i("l'username",username.getText().toString());

        //seconda variabile per la password
        EditText password =(EditText) findViewById(R.id.passwordTextId);
        Log.i("La password",password.getText().toString());

        //Toast per stampare il valore username e il valore della password inseriti dall'utente.
        Toast.makeText(this,"l'Username inserito è: "+username.getText(),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"La password inserita è: "+password.getText(),Toast.LENGTH_SHORT).show();


    }

    public void cancella(View view){

        Log.i("Bottone","Premuto");
    }

    public void chiudi(View view){

        Log.i("Bottone","è stato usato");

    }
    public void home(View viev){

        Log.i("Bottone","Chiudi premuto");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //messaggio che chiede di iserire l'utente e la password.
        Toast.makeText(this,"Inserire l'username e la password",Toast.LENGTH_SHORT).show();


    }
}
