package nivel_intermediario.segunda_parte;

public class Main {
    public static void main(String[] args) {

        // Obj Ninja não pode ser criado

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 16, 500, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obg Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 17, 200, NivelNinja.GENIN);

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
        sasuke.sharinganAtivado();

        // Obg Uchiha 2
        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi Uchiha";
        itachi.aldeia = "Konoha";
        itachi.idade = 21;

        itachi.metodoProvisorio();
        itachi.habilidadeEspecial();

        // Obg Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Konoha";
        kakashi.idade = 27;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.liderDaFolha();

        // Obg Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Konoha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

        // Metodo Comum
        madara.inteligenciaDeCombate();

        // Metodo Sobrecarregado
        madara.inteligenciaDeCombate(180);

    }
}
