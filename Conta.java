import java.util.ArrayList;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private String documento;
    private HistoricoTransacoes historico;

    public Conta(int numero, String nome, double saldo, String documento) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.documento = documento;
        this.historico = new HistoricoTransacoes();
    }

    public void deposito(double valor) {
        saldo += valor;
        historico.adicionarTransacao("Depósito", valor);
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historico.adicionarTransacao("Saque", -valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<String> getHistorico() {
        return historico.getHistorico();
    }

}
