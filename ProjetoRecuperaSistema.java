package Praticando.Pessoal;

import java.util.ArrayList;

public class ProjetoRecuperaSistema {
    private ArrayList<ProjetoRecuperaAluno> alunos;
    public ProjetoRecuperaSistema() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(ProjetoRecuperaAluno aluno) {
        alunos.add(aluno);
        System.out.println("✅ Aluno " + aluno.getNome() + " adicionado ao nosso sistema com sucesso!");
    }

    public void listarTodos() {
        if (alunos.isEmpty()) {
            System.out.println("❌ Nenhum aluno encontrado");
            return;
        }

        System.out.println("\n============= ALUNOS REGISTRADOS =============");
        for (int i = 0; i < alunos.size(); i++) {
            ProjetoRecuperaAluno aluno = alunos.get(i);
            System.out.println((i + 1) + ". " + aluno.getNome() +
                    " | Ano: " + aluno.getAnoEscolar() +
                    " | Média: " + String.format("%.2f", aluno.getMedia()));
        }
        System.out.println("========================================\n");
    }
    public ProjetoRecuperaAluno buscarPorNome (String nome) {
        for (ProjetoRecuperaAluno aluno : alunos) {
            if (aluno.temNome(nome)){
                return aluno;
            }
        }
        System.out.println("❌ Aluno '" + nome + "' não encontrado!");
        return null;
    }

    public void removerAluno(String nome) {
        ProjetoRecuperaAluno aluno = buscarPorNome(nome);

        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("✅ Aluno '" + nome + "' removido com sucesso!");
        }
        else {
            System.out.println("❌ Não foi possível remover. Aluno não encontrado");
        }
    }

    public double calcularMediaTurma() {
        if (alunos.isEmpty()) {
            System.out.println("❌ Nenhum aluno cadastrado!");
            return 0;
        }

        double soma = 0;
        for (ProjetoRecuperaAluno aluno : alunos) {
            soma += aluno.getMedia();
        }

        double media = soma / alunos.size();
        return media;
    }
}
