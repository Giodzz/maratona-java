package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Joãozin";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Joana";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
