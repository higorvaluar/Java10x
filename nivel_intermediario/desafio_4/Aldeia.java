package nivel_intermediario.desafio_4;

public class Aldeia {
    public static void main(String[] args) {
        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi", 30,"Sharingan");
        Kakashi.habilidade();
        Kakashi.executarHabilidade();
        Kakashi.mostrarInformacoes();

        NinjaBasico Naruto = new NinjaBasico("Naruto", 16, "Kage Bunshin no Jutsu");
        Naruto.habilidade();
        Naruto.executarHabilidade();
        Naruto.mostrarInformacoes();
    }
}
