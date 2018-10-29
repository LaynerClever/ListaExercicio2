package com.example.layner.listaexercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSalvar = findViewById(R.id.btSalvar);
        Button btCancelar = findViewById(R.id.btCancelar);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Campos
                EditText edtNome = findViewById(R.id.edtNome);
                EditText edtEmail = findViewById(R.id.edtEmail);
                EditText edtTelefone = findViewById(R.id.edtTelefone);
                EditText edtSenha = findViewById(R.id.edtSenha);

                //Resultado
                Log.d("Dados", edtNome.getText().toString());
                Log.d("Dados", edtEmail.getText().toString());
                Log.d("Dados", edtTelefone.getText().toString());
                Log.d("Dados", edtSenha.getText().toString());
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Campos
                EditText edtNome = findViewById(R.id.edtNome);
                EditText edtEmail = findViewById(R.id.edtEmail);
                EditText edtTelefone = findViewById(R.id.edtTelefone);
                EditText edtSenha = findViewById(R.id.edtSenha);


                edtNome.getText().clear();
                edtEmail.getText().clear();
                edtTelefone.getText().clear();
                edtSenha.getText().clear();
            }
        });
    }
}
