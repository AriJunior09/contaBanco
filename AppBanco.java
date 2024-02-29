import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = null;
        ArrayList<String> historico = new ArrayList<>();

        System.out.println("Sua conta é para pessoa:\n"
                + "1 - Fisica\n"
                + "2 - Juridica\n");
        char tipoDeConta = sc.next().charAt(0);

        if (tipoDeConta == '1') {
            conta = criarConta(sc, "Pessoa Física", "CPF");
        } else if (tipoDeConta == '2') {
            conta = criarConta(sc, "Empresa", "CNPJ");
        } else {
            System.out.println("Opção inválida.");
        }

        if (conta != null) {
            System.out.println("--------Dados da conta---------");
            System.out.println(conta);
            System.out.println();

            int opcao;
            do {
                System.out.println("O que você deseja fazer?");
                System.out.println("1 - Realizar um depósito");
                System.out.println("2 - Realizar um saque");
                System.out.println("3 - Visualizar os dados da conta");
                System.out.println("4 - Sair");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        realizarDeposito(sc, conta, historico);
                        break;
                    case 2:
                        realizarSaque(sc, conta, historico);
                        break;
                    case 3:
                        visualizarHistorico(historico, conta.getSaldo());
                        break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 4);
        }

        sc.close();
    }

    private static Conta criarConta(Scanner sc, String tipoConta, String documento) {
        System.out.println("Dados para " + tipoConta + "---\n");
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Agora digite o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Agora digite o seu " + documento + ": ");
        String documentoNumero = sc.next();

        System.out.print("Vai fazer um depósito inicial (s/n)? ");
        char respDep = sc.next().charAt(0);
        double saldoInicial = 0.0;
        if (respDep == 's') {
            System.out.print("Digite o valor inicial: ");
            saldoInicial = sc.nextDouble();
        }

        if (tipoConta.equals("Pessoa Física")) {
            return new ContaPessoa(numero, nome, saldoInicial, documentoNumero);
        } else {
            return new ContaEmpresa(numero, nome, saldoInicial, documentoNumero);
        }
    }

    private static void realizarDeposito(Scanner sc, Conta conta, ArrayList<String> historico) {
        System.out.print("Digite o valor do depósito: R$ ");
        double depValor = sc.nextDouble();
        conta.deposito(depValor);
        historico.add("Data: " + new Date() + " - Deposito: +R$ " + depValor);
        System.out.println();

        System.out.println("Dados Atualizado da conta:");
        System.out.println(conta);
        System.out.println();
    }

    private static void realizarSaque(Scanner sc, Conta conta, ArrayList<String> historico) {
        System.out.print("Digite o valor do saque: R$ ");
        double saqValor = sc.nextDouble();
        conta.saque(saqValor);
        historico.add("Data: " + new Date() + " - Saque: -R$ " + saqValor);
        System.out.println();

        System.out.println("Dados Atualizado da conta:");
        System.out.println(conta);
        System.out.println();
    }

    private static void visualizarHistorico(ArrayList<String> historico, double saldoAtual) {
        System.out.println("Histórico de operações:");
        for (String operacao : historico) {
            System.out.println(operacao);
        }
        System.out.println("Saldo Atual: R$ " + saldoAtual);
        System.out.println();
    }
}
