
package exercicio3;


public class Exercicio3 {

    public static void main(String[] args) {
         Instrumento violao = new Violao();
        Instrumento piano = new Piano();
        Instrumento bateria = new Bateria();
        Instrumento flauta = new Flauta();
        Instrumento guitarra = new Guitarra();

        violao.tocar();
        piano.tocar();
        bateria.tocar();
        flauta.tocar();
        guitarra.tocar();

    }
}
