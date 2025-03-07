package nivel_intermediario.primeiras_aulas;

public class Main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages();
        Tobirama.nome = "Tobirama Senju";
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages();
        Hiruzen.nome = "Hiruzen Sarutobi";
        Hiruzen.idade = 40;
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages();
        Minato.nome = "Minato Namikaze";
        System.out.println(Minato.nome);
    }
}
