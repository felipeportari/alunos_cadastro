package com.example.alunos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criar uma lista de alunos de exemplo
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1, "Felipe Portari Guimarães dos Santos", "12345-678", "Rua A", "", "Centro", "São Paulo", "SP"));
        alunos.add(new Aluno(2, "mals eu esqueci de fazer a tarefa", "98765-432", "Rua 12342 (rua real)", "", "Jardim", "Rio de Janeiro", "RJ"));

        // Criar um adaptador personalizado
        AlunoAdapter adapter = new AlunoAdapter(this, alunos);

        // Obter a referência da ListView
        ListView listViewAlunos = findViewById(R.id.listViewAlunos);

        // Definir o adaptador personalizado na ListView
        listViewAlunos.setAdapter(adapter);

        // Defina um OnClickListener para o botão "Cadastrar"
        Button buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicie a atividade de cadastro quando o botão for clicado
                Intent intent = new Intent(MainActivity.this, CadastroAlunoActivity.class);
                startActivity(intent);
            }
        });
    }
}
