package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        // isso altera diretamente na veriável que está apontando
        estudante.nome = "Maria das Dores";
    }
}
