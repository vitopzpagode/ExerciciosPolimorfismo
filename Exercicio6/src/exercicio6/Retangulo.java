
package exercicio6;

public class Retangulo extends Forma {

    @Override
    public double calcularArea() {
        double base = getDimensaoPrincipal();
        double altura = getDimensaoPrincipal();
        return base * altura;
    }
}
