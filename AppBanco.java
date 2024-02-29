import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = null;
        
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
            
            realizarOperacoes(sc, conta);
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

    private static void realizarOperacoes(Scanner sc, Conta conta) {
        System.out.print("Digite o valor do depósito: R$ ");
        double depValor = sc.nextDouble();
        conta.deposito(depValor);
        System.out.println();
        
        System.out.println("Dados Atualizado da conta:");
        System.out.println(conta);
        System.out.println();
        
        System.out.print("Digite o valor o saque: R$ ");
        double saqValor = sc.nextDouble();
        conta.saque(saqValor);
        System.out.println();
        
        System.out.println("Dados Atualizado da conta:");
        System.out.println(conta);
    }
}
