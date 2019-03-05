package br.com.danielvtfs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoErvilha = findViewById(R.id.botao_ervilha);
        botaoErvilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SopaErvilhaActivity.class);
                startActivity(intent);
            }
        });

        Button botaoBolo = findViewById(R.id.botao_bolo);
        botaoBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BoloActivity.class);
                startActivity(intent);
            }
        });

        Button botaoTorta = findViewById(R.id.botao_torta);
        botaoTorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TortaActivity.class);
                startActivity(intent);
            }
        });

        Button botaoCookie = findViewById(R.id.botao_cookie);
        botaoCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CookieActivity.class);
                startActivity(intent);
            }
        });

        Button botaoSorvete = findViewById(R.id.botao_sorvete);
        botaoSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SorveteActivity.class);
                startActivity(intent);
            }
        });

    }
}
