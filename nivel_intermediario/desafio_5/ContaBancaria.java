package nivel_intermediario.desafio_5;

public abstract class ContaBancaria implements Conta {
    String nome;
    int idade;
    String dataNascimento;
    double saldo;

    public ContaBancaria(String nome, int idade, String dataNascimento, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println(nome + ", seu saldo atual é de R$" + saldo);
    }
}
