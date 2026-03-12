
package exercicio11;

public class Exercicio11 {

    public static void main(String[] args) {
         Profissao medico = new Medico();
        Profissao professor = new Professor();
        Profissao engenheiro = new Engenheiro();
        Profissao advogado = new Advogado();
        Profissao arquiteto = new Arquiteto();

        medico.executarTrabalho();
        professor.executarTrabalho();
        engenheiro.executarTrabalho();
        advogado.executarTrabalho();
        arquiteto.executarTrabalho();

    }
}
