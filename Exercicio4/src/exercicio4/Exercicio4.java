
package exercicio4;


public class Exercicio4 {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario programador = new Programador();
        Funcionario designer = new Designer();
        Funcionario suporte = new SuporteTecnico();

        gerente.trabalhar();
        vendedor.trabalhar();
        programador.trabalhar();
        designer.trabalhar();
        suporte.trabalhar();

    }
}