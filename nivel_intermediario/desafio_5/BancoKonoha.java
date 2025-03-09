package nivel_intermediario.desafio_5;

import java.util.ArrayList;
import java.util.List;

public class BancoKonoha {
    private List<ContaBancaria> contas;

    public BancoKonoha() {
        contas = new ArrayList<>();
    }

    // Add uma conta ao banco
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Transferência entre contas
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.saldo >= valor) {
            origem.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    // Metodo sobrecarregado
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor, TipoConta tipoOrigem, TipoConta tipoDestino) {
        if (origem instanceof ContaCorrente && destino instanceof ContaPoupanca) {
            System.out.println("Transferência de Conta Corrente para Poupança.");
        } else if (origem instanceof ContaPoupanca && destino instanceof ContaCorrente) {
            System.out.println("Transferência de Poupança para Conta Corrente.");
        }
        transferir(origem, destino, valor); // Reutiliza o metodo de transferência principal
    }
}
