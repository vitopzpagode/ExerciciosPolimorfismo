
package exercicio5;

public class Pix extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via PIX");
    }
}
