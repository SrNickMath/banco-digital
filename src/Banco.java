import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Getter
@Setter
@RequiredArgsConstructor
public class Banco {

    @NonNull private final String nome;
    private final List<Conta> contas = new ArrayList<>();

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        if (conta != null) {
            contas.add(conta);
        }
    }

    // Método para remover uma conta do banco
    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    // Método para obter uma conta por meio de seu número
    public Conta buscarContaPorNumero(int numero) {
        return contas.stream()
                .filter(conta -> conta.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    // Método para obter uma lista não modificável de contas
    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }

    @Override
    public String toString() {
        return "Banco(nome=" + nome + ", número de contas=" + contas.size() + ")";
    }
}