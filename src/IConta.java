/**
 * Interface que define os contratos para operações bancárias.
 */
public interface IConta {

    /**
     * Realiza um saque na conta.
     *
     * @param valor O valor a ser sacado.
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     *
     * @param valor O valor a ser depositado.
     */
    void depositar(double valor);

    /**
     * Realiza uma transferência de valor para outra conta.
     *
     * @param valor O valor a ser transferido.
     * @param contaDestino A conta para a qual o valor será transferido.
     */
    void transferir(double valor, Conta contaDestino);

    /**
     * Imprime o extrato da conta.
     */
    void imprimirExtrato();
}