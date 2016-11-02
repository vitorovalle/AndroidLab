package com.example.principal.sided;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
