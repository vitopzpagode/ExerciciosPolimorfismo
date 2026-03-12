
package exercicio5;


public class Exercicio5 {

   
    public static void main(String[] args) {
       Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Pix();
        Pagamento pagamento3 = new Dinheiro();
        Pagamento pagamento4 = new Boleto();
        Pagamento pagamento5 = new TransferenciaBancaria();

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
        pagamento3.processarPagamento();
        pagamento4.processarPagamento();
        pagamento5.processarPagamento();

    }
}
