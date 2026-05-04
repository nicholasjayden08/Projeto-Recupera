package Praticando.Pessoal;

public class ProjetoRecuperaAluno {
    private String nome;
    private String anoEscolar;
    private double nota01 = 0;
    private double nota02 = 0;
    private double nota03 = 0;
    private double nota04 = 0;
    private int notasAdicionadas = 0;
    private double mediaMinima;

    public ProjetoRecuperaAluno(String nome, String anoEscolar,double mediaMinima) {
        this.nome = nome;
        this.anoEscolar = anoEscolar;
        this.nota01 = nota01 = 0;
        this.nota02 = nota02 = 0;
        this.nota03 = nota03 = 0;
        this.nota04 = nota04 = 0;
        this.mediaMinima = mediaMinima;
    }

    public double calcularMedia() {
        if (nota01 == 0 && nota02 == 0 && nota03 == 0 && nota04 == 0) {
            return 0;
        }
        return (nota01 + nota02 + nota03 + nota04) / 4.0;
    }

    public boolean passou() {
        return calcularMedia() >= mediaMinima;
    }

    public String getNome() {
        return nome;
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

    public void adicionarNota(double nota) {
        if (nota01 == 0) {
            nota01 = nota;
            System.out.println("✅ Nota 1 adicionada: " + nota);
        }
        else if (nota02 == 0) {
            nota02 = nota;
            System.out.println("✅ Nota 2 adicionada: " + nota);
        }
        else if (nota03 == 0) {
            nota03 = nota;
            System.out.println("✅ Nota 3 adicionada: " + nota);
        }
        else if (nota04 == 0) {
            nota04 = nota;
            System.out.println("✅ Nota 4 adicionada: " + nota);
        }
        else {
            System.out.println("❌ Este aluno já tem todas as 4 notas!");
        }
    }

    public String statusNotas() {
        int notasAdicionadas = 0;
        if (nota01 > 0) notasAdicionadas++;
        if (nota02 > 0) notasAdicionadas++;
        if (nota03 > 0) notasAdicionadas++;
        if (nota04 > 0) notasAdicionadas++;

        return notasAdicionadas + "/4 notas adicionadas";
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
