
package exercicio10;

public class Movel extends Produto {

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.18;
    }
}
