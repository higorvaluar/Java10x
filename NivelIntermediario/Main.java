package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Objeto 1
         Uzumaki Naruto = new Uzumaki();
         Naruto.nome = "Naruto Uzumaki";
         Naruto.idade = 32;
         Naruto.aldeia = "Konoha";
         Naruto.chakraPraCaralho();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 33;
        Sasuke.aldeia = "Konoha";
        Sasuke.SharinganAtivado();

        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 32;
        Sakura.aldeia = "Konoha";
        Sakura.ativarCura();

        // Objeto 4
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.idade = 31;
        Hinata.aldeia = "Konoha";
        Hinata.ativarByakugan();

        // Objeto 5
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.idade = 13;
        Boruto.aldeia = "Konoha";
        Boruto.ativarKarma();
        Boruto.ativarJougan();
        Boruto.chakraPraCaralho();

    }
}
