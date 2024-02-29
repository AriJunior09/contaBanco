public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    
    
    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }


    public double getSaldo() {
        return saldo;
    }
    
    public void deposito(double quantia) {
        saldo += quantia;
    }
    
    public void saque(double quantia) {
        saldo -= quantia + 5.00;
    }
    
    public String toString() {
        return "Número da conta: " 
                + numero
                + ", Nome: "
                + nome
                + ", Saldo: R$ "
                + String.format("%.2f", getSaldo());
                
    }

}
