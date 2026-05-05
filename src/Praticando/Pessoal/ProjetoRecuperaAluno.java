package Praticando.Pessoal;

import java.util.ArrayList;

public class ProjetoRecuperaAluno {
    private String nome;
    private String anoEscolar;
    private ArrayList<Double> notas;
    private int notasAdicionadas = 0;
    private double mediaMinima;

    public ProjetoRecuperaAluno(String nome, String anoEscolar,double mediaMinima) {
        this.nome = nome;
        this.anoEscolar = anoEscolar;
        this.mediaMinima = mediaMinima;
        this.notas = new ArrayList<>();
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public boolean passou() {
        return calcularMedia() >= mediaMinima;
    }

    public String getNome() {
        return nome;
    }

    public void exibirResultado() {
        double media = calcularMedia();

        if (media == 0) {
            System.out.println(nome + ", você ainda não tem notas registradas em nosso sistema");
        }

        if (passou()) {
            System.out.println(nome + ", você passou de ano no " + anoEscolar
                    + " com média " + media + " PARABÉNS!!");
        }
        else {
            System.out.println(nome + ", você não passou. Sua média foi" + media
                    + " (mínimo: "  + mediaMinima + "). Tente novamente!");

        }
    }

    public void adicionarNota(double nota) {
        if (nota <= 0 || nota > 10) {
            System.out.println("❌ Nota inválida! Deve estar entre 0 e 10");
            return;
        }
        notas.add(nota);
        System.out.println("✅ Nota " + String.format("%.2f", nota) + " adicionada");
    }

    public String statusNotas() {
        return notas.size() + " notas adicionadas";
    }

    public double getMedia() {
        return calcularMedia();
    }

    public boolean temNome(String nomeBuscado) {
        return this.nome.equalsIgnoreCase(nomeBuscado);
    }

    public String getAnoEscolar() {
        return anoEscolar;
    }
}
