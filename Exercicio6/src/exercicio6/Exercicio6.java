
package exercicio6;


public class Exercicio6 {

    public static void main(String[] args) {
 Forma quadrado = new Quadrado();
        quadrado.setDimensaoPrincipal(4);

        Forma circulo = new Circulo();
        circulo.setDimensaoPrincipal(3);

        Forma triangulo = new Triangulo();
        triangulo.setDimensaoPrincipal(5);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

    }
}