public class Main {
    public static void main(String[] args) {

        // Criação de cliente
        Cliente srnickmath = new Cliente();
        srnickmath.setNome("SrNickMath");

        // Criação de contas
        Conta corrente = new ContaCorrente(srnickmath);
        Conta poupanca = new ContaPoupanca(srnickmath);

        // Operações nas contas
        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        // Impressão dos extratos
        System.out.println("\nExtratos:");
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}