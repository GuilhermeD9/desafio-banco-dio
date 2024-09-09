public class ContaCorrente extends Conta{
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente:");
        System.out.println("Agência: " + super.getAgencia());
        System.out.println("Conta: " + super.getNumero());
        System.out.println("Saldo: " + super.getSaldo());
    }
}
