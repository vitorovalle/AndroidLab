package com.example.principal.sided;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.principal.sided.R.id.BotaoSair;
import static com.example.principal.sided.R.id.activity_main;
import static com.example.principal.sided.R.id.activity_segunda_tela;

public class SegundaTelaActivity extends AppCompatActivity {

    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        botaoVoltar = (Button) findViewById(R.id.BotaoSair);


    botaoVoltar.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {

            SegundaTelaActivity.this.finish();
        }
    });
    }
    }