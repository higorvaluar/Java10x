package nivel_intermediario.desafio_5;

public class Main {
    public static void main(String[] args) {
        // Cria contas
        ContaCorrente contaCorrente = new ContaCorrente("Naruto Uzumaki", 17, "10/10/2005", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Sasuke Uchiha", 17, "23/07/2005", 500);

        // Cria o banco e adiciona as contas
        BancoKonoha banco = new BancoKonoha();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Consulta saldos iniciais
        System.out.println("Saldos iniciais:");
        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

        // Realiza transferência
        banco.transferir(contaCorrente, contaPoupanca, 200, TipoConta.CORRENTE, TipoConta.POUPANCA);

        // Consulta saldos após transferência
        System.out.println("Saldos após transferência:");
        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
    }
}
