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

                    System.out.println("Média mínima da instituição: ");
                    double mediaMinima = scanner.nextDouble();
                    scanner.nextLine();

                    ProjetoRecuperaAluno aluno = new ProjetoRecuperaAluno(nome, anoEscolar, mediaMinima);
                    sistema.adicionarAluno(aluno);
                    break;

                case 2:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeAlunoNota = scanner.nextLine();

                    ProjetoRecuperaAluno alunoParaNota = sistema.buscarPorNome(nomeAlunoNota);
                    if (alunoParaNota != null) {
                        System.out.println("Status: " + alunoParaNota.statusNotas());
                        System.out.println("Digite a sua nota: ");
                        double nota = scanner.nextDouble();
                        scanner.nextLine();
                        alunoParaNota.adicionarNota(nota);
                    }
                    break;

                case 3:
                    System.out.println("Digite seu Nome: ");
                    String nomeMeuAluno = scanner.nextLine();

                    ProjetoRecuperaAluno meuAluno = sistema.buscarPorNome(nomeMeuAluno);
                    if (meuAluno != null) {
                        System.out.println("\n========== SEUS DADOS ==========");
                        System.out.println("Nome: " + meuAluno.getNome());
                        System.out.println("Ano: " + meuAluno.getAnoEscolar());
                        System.out.println("Status: " + meuAluno.statusNotas());
                        if (meuAluno.getMedia() > 0) {
                            System.out.println("Sua média: " + String.format("%.2f", meuAluno.getMedia()));
                            meuAluno.exibirResultado();
                        }
                        else {
                            System.out.println("Você ainda não tem notas!");
                        }
                        System.out.println("================================\n");
                    }
                    break;

                case 4:
                    sistema.listarTodos();
                    break;

                case 5:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeBusca = scanner.nextLine();

                    ProjetoRecuperaAluno alunoEncontrado = sistema.buscarPorNome(nomeBusca);
                    if (alunoEncontrado != null) {
                        System.out.println("\n✅ Aluno encontrado:");
                        System.out.println("Nome Completo: " + alunoEncontrado.getNome());
                        System.out.println("Ano Escolar: " + alunoEncontrado.getAnoEscolar());
                        System.out.println("Média: " + String.format("%.2f", alunoEncontrado.getMedia()));

                    }
                    break;

                case 6:
                    System.out.println("Digite o nome do aluno para remover: ");
                    String nomeRemover = scanner.nextLine();
                    sistema.removerAluno(nomeRemover);
                    break;

                case 7:
                    double mediaTurma = sistema.calcularMediaTurma();
                    if (mediaTurma > 0) {
                        System.out.println("\n Média da Turma: " + String.format("%.2f", mediaTurma));
                    }
                    break;

                case 8:
                    rodando = false;
                    System.out.println("Até logo!!");
                    break;
                default:
                    System.out.println("❌ Opção inválida!!");
            }
        }
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n======= PROJETO RECUPERA =======");
        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Adicionar Notas a um Aluno");
        System.out.println("3. Ver minha Média");
        System.out.println("4. Listar Todos os Alunos");
        System.out.println("5. Buscar Aluno por Nome");
        System.out.println("6. Remover Aluno");
        System.out.println("7. Calcular Média da Turma");
        System.out.println("8. Sair");
        System.out.println("==========================================");
        System.out.println("Escolha uma Opção: ");
    }


}
