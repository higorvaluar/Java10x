package nivel_intermediario.estudandoGenerics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Fuuma Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho de Invocação");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
