package Praticando.Pessoal;

import java.util.Scanner;

public class ProjetoRecupera01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Ano Escolar: ");
        String anoEscolar = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota01 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nota 2: ");
        double nota02 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nota 3: ");
        double nota03 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nota 4: ");
        double nota04 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Média mínima da sua instituição: ");
        double mediaMinima = scanner.nextDouble();
        scanner.nextLine();

        ProjetoRecuperaAluno aluno = new ProjetoRecuperaAluno (nome, anoEscolar, nota01, nota02, nota03, nota04, mediaMinima);

        aluno.exibirResultado();

        scanner.close();



    }
}
