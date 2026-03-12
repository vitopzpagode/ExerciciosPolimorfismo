
package exercicio9;

public class Exercicio9 {


    public static void main(String[] args) {
         Personagem guerreiro = new Guerreiro();
        Personagem mago = new Mago();
        Personagem arqueiro = new Arqueiro();
        Personagem ladino = new Ladino();
        Personagem paladino = new Paladino();

        guerreiro.atacar();
        mago.atacar();
        arqueiro.atacar();
        ladino.atacar();
        paladino.atacar();

    }
}
