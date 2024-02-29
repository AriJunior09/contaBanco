public class ContaPessoa extends Conta{
    private String cpf;

    
    public ContaPessoa(int numero, String nome, double saldo, String cpf) {
        super(numero, nome, saldo);
        this.cpf = cpf;
    }
    
    public ContaPessoa(int numero, String nome, String cpf) {
        super(numero, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\nNúmero da conta: " + this.getNumero() +
               "\nNome: " + this.getNome() +
               "\nSaldo: R$ " + this.getSaldo();
    }
    

}
