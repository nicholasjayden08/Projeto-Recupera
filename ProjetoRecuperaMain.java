package Praticando.Pessoal;

import java.util.Scanner;

public class ProjetoRecuperaMain {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProjetoRecuperaSistema sistema = new ProjetoRecuperaSistema();

        boolean rodando = true;

        while (rodando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.println("Ano escolar: ");
                    String anoEscolar = scanner.nextLine();

                    System.out.println("Nota 01: ");
                    double nota01 = scanner.nextDouble();

                    System.out.println("Nota 02: ");
                    double nota02 = scanner.nextDouble();

                    System.out.println("Nota 03: ");
                    double nota03 = scanner.nextDouble();

                    System.out.println("Nota 04: ");
                    double nota04 = scanner.nextDouble();

                    System.out.println("Média mínima da instituição: ");
                    double mediaMinima = scanner.nextDouble();
                    scanner.nextLine();

                    ProjetoRecuperaAluno aluno = new ProjetoRecuperaAluno(nome, anoEscolar, nota01, nota02, nota03, nota04, mediaMinima);
                    sistema.adicionarAluno(aluno);
                    break;

                case 2:
                    sistema.listarTodos();
                    break;

                case 3:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeBusca = scanner.nextLine();

                    ProjetoRecuperaAluno alunoEncontrado = sistema.buscarPorNome(nomeBusca);
                    if (alunoEncontrado != null) {
                        System.out.println("\n✅ Aluno encontrado:");
                        System.out.println("Nome Completo: " + alunoEncontrado.getNome());
                        System.out.println("Ano Escolar: " + alunoEncontrado.getAnoEscolar());
                        System.out.println("Média: " + String.format("%.2f", alunoEncontrado.getMedia()));
                        alunoEncontrado.exibirResultado();
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do aluno para remover: ");
                    String nomeRemover = scanner.nextLine();
                    sistema.removerAluno(nomeRemover);
                    break;

                case 5:
                    double mediaTurma = sistema.calcularMediaTurma();
                    if (mediaTurma > 0) {
                        System.out.println("\n Média da Turma: " + String.format("%.2f", mediaTurma));
                    }
                    break;

                case 6:
                    System.out.println("Até logo!!");
                    break;
                default:
                    System.out.println("❌ Opção inválida!!");
            }
        }
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n======= SISTEMA DE CADASTRO DE ALUNOS =======");
        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Listar Todos os Alunos");
        System.out.println("3. Buscar Aluno por Nome");
        System.out.println("4. Remover Aluno");
        System.out.println("5. Calcular Média da Turma");
        System.out.println("6. Sair");
        System.out.println("==========================================");
        System.out.println("Escolha uma Opção: ");
    }


}
