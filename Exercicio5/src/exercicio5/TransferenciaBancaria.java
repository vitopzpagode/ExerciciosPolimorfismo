
package exercicio5;

    public class TransferenciaBancaria extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado por transferência bancária");
    }
}

