package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Joãozin";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Joana";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        // quando um objeto é passado como parâmetro
        // é do tipo referência
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println("#############");
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
