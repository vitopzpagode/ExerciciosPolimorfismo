
package exercicio10;


public class Exercicio10 {

    public static void main(String[] args) {
         Produto livro = new Livro();
        livro.setPreco(50);

        Produto eletronico = new Eletronico();
        eletronico.setPreco(1000);

        Produto roupa = new Roupa();
        roupa.setPreco(100);

        Produto alimento = new Alimento();
        alimento.setPreco(20);

        Produto movel = new Movel();
        movel.setPreco(500);

        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do eletrônico: " + eletronico.calcularPrecoFinal());
        System.out.println("Preço final da roupa: " + roupa.calcularPrecoFinal());
        System.out.println("Preço final do alimento: " + alimento.calcularPrecoFinal());
        System.out.println("Preço final do móvel: " + movel.calcularPrecoFinal());

    }
}
