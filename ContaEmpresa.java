public class ContaEmpresa extends Conta{
    private String cnpj;
    
    public ContaEmpresa(int numero, String nome, double saldo, String cnpj) {
        super(numero, nome, saldo);
        this.cnpj = cnpj;
    }
    
    public ContaEmpresa(int numero, String nome, String cnpj) {
        super(numero, nome);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public String toString() {
        return "\nNúmero da conta: " + this.getNumero() +
               "\nNome: " + this.getNome() +
               "\nSaldo: R$ " + this.getSaldo();
    }
}
