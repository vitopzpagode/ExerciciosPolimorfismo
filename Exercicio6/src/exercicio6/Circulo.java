
package exercicio6;

public class Circulo extends Forma {

    @Override
    public double calcularArea() {
        double raio = getDimensaoPrincipal();
        return Math.PI * raio * raio;
    }
}
