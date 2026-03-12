
package exercicio10;

public class Alimento extends Produto {

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }
}
