package br.com.danielvtfs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SopaErvilhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopa_ervilha);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
