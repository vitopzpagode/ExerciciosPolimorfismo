
package exercicio10;

public class Roupa extends Produto {

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.15;
    }
}
