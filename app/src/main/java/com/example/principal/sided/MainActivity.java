package com.example.principal.sided;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import static com.example.principal.sided.R.id.BotaoAcessar;
import static com.example.principal.sided.R.id.activity_main;
import static com.example.principal.sided.R.id.activity_segunda_tela;

public class MainActivity extends AppCompatActivity {

    private Button botaoAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoAcessar = (Button) findViewById(R.id.BotaoAcessar);

        botaoAcessar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(MainActivity.this, SegundaTelaActivity.class);
                startActivity(trocadorTela);

            }
        });


    }


}