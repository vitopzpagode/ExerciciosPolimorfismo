
package exercicio10;

public class Eletronico extends Produto {

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.20;
    }
}
