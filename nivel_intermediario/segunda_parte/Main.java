package nivel_intermediario.segunda_parte;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 16, 230, NivelNinja.GENIN);
        System.out.println(naruto);
        System.out.println("");

        System.out.println("---------- Sasuke Uchiha ------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 17, 130, NivelNinja.GENIN);
        System.out.println(sasuke);
        System.out.println("");

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Anbu";

        System.out.println("");
    }
}
