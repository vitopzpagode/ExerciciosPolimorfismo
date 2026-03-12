
package exercicio9;


public class Personagem {
    private String nome;
    private int nivel;
    private double vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void atacar() {
        System.out.println("O personagem ataca!");
    }
}

