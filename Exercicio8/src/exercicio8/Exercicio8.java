
package exercicio8;


public class Exercicio8 {

    public static void main(String[] args) {
    
        Transporte onibus = new Onibus();
        Transporte metro = new Metro();
        Transporte trem = new Trem();
        Transporte uber = new Uber();
        Transporte taxi = new Taxi();

        System.out.println("Tarifa ônibus: " + onibus.calcularTarifa());
        System.out.println("Tarifa metrô: " + metro.calcularTarifa());
        System.out.println("Tarifa trem: " + trem.calcularTarifa());
        System.out.println("Tarifa Uber: " + uber.calcularTarifa());
        System.out.println("Tarifa táxi: " + taxi.calcularTarifa());

    }
}
