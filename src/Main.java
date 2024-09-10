public class Main {
    public static void main(String[] args) {
        Cliente gui = new Cliente();
        gui.setNome("Guilherme");
        Cliente belle = new Cliente();
        belle.setNome("Sibelle");

        Conta cc = new ContaCorrente(gui, 'c');
        cc.depositar(100);
        Conta cp = new ContaPoupanca(belle, 'p');
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
