package nivel_intermediario.segunda_parte;

public class Hatake extends Ninja implements SharinganInteface, AnbuInterface, HokageInterface{
    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake!");
    }

    // Método da Interface
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o Sharingan!");
    }

    // Método da Interface
    public void ninjaDeElite() {
        System.out.println(nome + " é da Anbu, um ninja de elite de Konoha!");
    }

    // Método da Interface
    public void liderDaFolha() {
        System.out.println(nome + " é um Hokage!");
    }
}
