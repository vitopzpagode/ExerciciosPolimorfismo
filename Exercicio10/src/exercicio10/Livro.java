
package exercicio10;

public class Livro extends Produto {

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.10;
    }
}
