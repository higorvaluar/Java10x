package nivel_intermediario.estudando_records;

public class Main {
    public static void main(String[] args) {
        // Objeto feito com classe normal
        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 9999999);
        System.out.println("cadastro = " + cadastro);
        System.out.println("Nome do cadastro = " + cadastro.getNome());

        // Objeto feito com classe record
        NinjaRecord cadastroRecord = new NinjaRecord("Higor", 134);

    }
}
