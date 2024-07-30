import lombok.Getter;
import lombok.NonNull;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    @NonNull protected Cliente cliente;

    public Conta(@NonNull Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Valor inválido ou saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (contaDestino == null){
            throw new IllegalArgumentException("Conta destino não pode ser nula");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfos(){
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println();
    }

}
