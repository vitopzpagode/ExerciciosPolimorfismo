
package exercicio6;

public class Quadrado extends Forma {

    @Override
    public double calcularArea() {
        double lado = getDimensaoPrincipal();
        return lado * lado;
    }
}
