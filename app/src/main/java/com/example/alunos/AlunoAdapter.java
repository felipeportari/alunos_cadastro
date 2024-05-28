package com.example.alunos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class AlunoAdapter extends ArrayAdapter<Aluno> {

    public AlunoAdapter(Context context, List<Aluno> alunos) {
        super(context, 0, alunos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtenha o item para esta posição
        Aluno aluno = getItem(position);

        // Verifique se uma view está sendo reutilizada, caso contrário, infle uma nova
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_aluno, parent, false);
        }

        // Preencha os dados do aluno no layout do item
        TextView textViewNome = convertView.findViewById(R.id.textViewNome);
        TextView textViewDetalhes = convertView.findViewById(R.id.textViewDetalhes);

        if (aluno != null) {
            textViewNome.setText(aluno.getNome());
            textViewDetalhes.setText("RA: " + aluno.getRa() + ", Cidade: " + aluno.getCidade());
        }

        // Retorna a view atualizada
        return convertView;
    }
}
