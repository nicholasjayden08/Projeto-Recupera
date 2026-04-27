package Praticando.Pessoal;

public class ProjetoRecuperaAluno {
    private String nome;
    private String anoEscolar;
    private double nota01;
    private double nota02;
    private double nota03;
    private double nota04;
    private double mediaMinima;

    public ProjetoRecuperaAluno(String nome, String anoEscolar, double nota01,
                      double nota02, double nota03, double nota04, double mediaMinima) {
        this.nome = nome;
        this.anoEscolar = anoEscolar;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
        this.mediaMinima = mediaMinima;
    }

    public double calcularMedia() {
        return (nota01 + nota02 + nota03 + nota04) / 4.0;
    }

    public boolean passou() {
        return calcularMedia() >= mediaMinima;
    }

    public void exibirResultado() {
        double media = calcularMedia();

        if (passou()) {
            System.out.println(nome + ", você passou de ano no " + anoEscolar
                    + "com média " + media + " PARABÉNS!!");
        }
        else {
            System.out.println(nome + ", você não passou. Sua média foi" + media
                    + " (mínimo: "  + mediaMinima + "). Tente novamente!");

        }
    }
}
