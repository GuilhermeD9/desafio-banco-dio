public abstract class Conta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    private char tipoConta;

    public Conta(Cliente cliente, char tipoConta) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        System.out.println();
        if (tipoConta == 'c') {
            System.out.println("Extrato de Conta Corrente");
        } else {
            System.out.println("Extrato de Conta Poupança");
        }
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

}
