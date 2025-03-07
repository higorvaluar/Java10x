package nivel_intermediario.desafio_4;

public class NinjaAvancado extends NinjaBasico {
    public NinjaAvancado(String nome, int idade, String nomeHabilidade) {
        super(nome, idade, nomeHabilidade);
    }

    @Override
    public void habilidade() {
        System.out.println("Meu nome é " + getNome() + " Ativando " + getNomeHabilidade() + ", o ninja que copia.");
    }
}
