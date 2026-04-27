package Praticando.Pessoal;

public class ProjetoRecupera01 {
    public static void main(String[] args) {
        String nome = " ";
        String anoEscolar = " ";
        double mediaEscolar = 6.0;
        double nota01 = 0;
        double nota02 = 0;
        double nota03 = 0;
        double nota04 = 0;
        boolean isPassarDeAno = (nota01 + nota02 + nota03 + nota04) / 4.0 >= mediaEscolar;
        double mediaFinal = (nota01 + nota02 + nota03 + nota04) / 4.0;

        if (isPassarDeAno) {
            System.out.println(nome+" você passou de ano e concluiu o "+anoEscolar+" com média final de " +mediaFinal+" ,PARABÉNS!!");
        }
        else {
            System.out.println(nome+", nós da Projeto Recupera lhe informamos que você não atingiu a média necessaria para passar de ano e concluir o "+anoEscolar+" sua média final foi de "+mediaFinal+", oque não é o necessario, sentimos muito e desejamos um futuro brilhante para você.");
        }
    }
}
