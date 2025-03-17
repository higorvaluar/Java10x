package nivel_intermediario.terceira_parte;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Naruto", "Konoha", 17, 30, 1.67);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki com nome alterado pelo SET");
        System.out.println("Meu nome é " + naruto.getNome());

        System.out.println("---------- Sasuke Uchiha ----------");
    }
}
