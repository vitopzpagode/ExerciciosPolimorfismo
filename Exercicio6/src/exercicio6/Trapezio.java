
package exercicio6;

public class Trapezio extends Forma {

    @Override
    public double calcularArea() {
        double base = getDimensaoPrincipal();
        double altura = getDimensaoPrincipal();
        return (base + base) * altura / 2;
    }
}
