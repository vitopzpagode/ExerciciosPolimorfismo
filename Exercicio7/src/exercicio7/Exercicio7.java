
package exercicio7;


public class Exercicio7 {

    public static void main(String[] args) {
        
        Dispositivo tv = new Televisao();
        Dispositivo computador = new Computador();
        Dispositivo smartphone = new Smartphone();
        Dispositivo tablet = new Tablet();
        Dispositivo smartwatch = new Smartwatch();

        tv.ligar();
        computador.ligar();
        smartphone.ligar();
        tablet.ligar();
        smartwatch.ligar();

    }
}
