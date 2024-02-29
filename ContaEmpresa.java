public class ContaEmpresa extends Conta {
    private String cnpj;
    
    public ContaEmpresa(int numero, String nome, double saldo, String cnpj) {
        super(numero, nome, saldo, cnpj);
        this.cnpj = cnpj;
    }
    
    public ContaEmpresa(int numero, String nome, String cnpj) {
        super(numero, nome, 0.0, cnpj); // saldo inicial 0.0
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
