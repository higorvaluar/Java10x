package nivel_intermediario.desafio_5;

public class ContaPoupanca extends ContaBancaria {
    private TipoConta tipo;

    public ContaPoupanca(String nome, int idade, String dataNascimento, double saldo) {
        super(nome, idade, dataNascimento, saldo);
        this.tipo = TipoConta.POUPANCA; // Define o tipo como POUPANCA
    }

    public TipoConta getTipo() {
        return tipo;
    }

    double saldoTotal;

    @Override
    public void depositar(double valor) {
        saldoTotal += valor;
        saldo += valor * 0.99; // Deduz 1% do valor total
    }

    @Override
    public void consultarSaldo() {
        System.out.println(nome + ", seu saldo total seria de R$" + saldoTotal + ", mas é R$" + saldo);
        System.out.println("Por causa do imposto de 1%");
    }
}
