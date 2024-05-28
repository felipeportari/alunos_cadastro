package com.example.alunos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class CadastroAlunoActivity extends AppCompatActivity {

    private EditText editTextNome, editTextRa, editTextCep, editTextLogradouro, editTextComplemento, editTextBairro, editTextCidade, editTextUf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        editTextRa = findViewById(R.id.editTextRa);
        editTextNome = findViewById(R.id.editTextNome);
        editTextCep = findViewById(R.id.editTextCep);
        editTextLogradouro = findViewById(R.id.editTextLogradouro);
        editTextComplemento = findViewById(R.id.editTextComplemento);
        editTextBairro = findViewById(R.id.editTextBairro);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextUf = findViewById(R.id.editTextUf);

        Button buttonSalvar = findViewById(R.id.buttonSalvar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarAluno();
            }
        });
    }

    private void salvarAluno() {
        int ra = Integer.parseInt(editTextRa.getText().toString());
        String nome = editTextNome.getText().toString();
        String cep = editTextCep.getText().toString();
        String logradouro = editTextLogradouro.getText().toString();
        String complemento = editTextComplemento.getText().toString();
        String bairro = editTextBairro.getText().toString();
        String cidade = editTextCidade.getText().toString();
        String uf = editTextUf.getText().toString();

        Aluno aluno = new Aluno(ra, nome, cep, logradouro, complemento, bairro, cidade, uf);
        // Aqui você pode adicionar a lógica para salvar o aluno em um banco de dados
        // ou em uma lista de alunos, por exemplo
    }
}