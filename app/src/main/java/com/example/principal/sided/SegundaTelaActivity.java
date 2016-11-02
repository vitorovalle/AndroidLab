package com.example.principal.sided;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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