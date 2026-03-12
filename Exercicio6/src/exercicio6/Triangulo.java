
package exercicio6;

public class Triangulo extends Forma {

    @Override
    public double calcularArea() {
        double base = getDimensaoPrincipal();
        double altura = getDimensaoPrincipal();
        return (base * altura) / 2;
    }
}
