package nivel_intermediario.desafio_5;

public class ContaCorrente extends ContaBancaria {
    private TipoConta tipo;

    public ContaCorrente(String nome, int idade, String dataNascimento, double saldo) {
        super(nome, idade, dataNascimento, saldo);
        this.tipo = TipoConta.CORRENTE; // Define o tipo como CORRENTE
    }

    public TipoConta getTipo() {
        return tipo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
