package edu.cientifica.convivirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import edu.cientifica.convivirapp.view.ContainerActivity;
import edu.cientifica.convivirapp.view.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actividadInicial();

    }

    private void actividadInicial() {
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);

/*
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
*/


    }
}