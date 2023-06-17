package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) return;

        for (int i = 0; i < salarios.length; i++) {
            System.out.println(salarios[i]);
        }

        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) return;
        double soma = 0;
        int tam = salarios.length;
        double media;

        for (int i = 0; i < tam; i++) {
            soma += salarios[i];
        }

        media = soma / tam;
        System.out.println(media);
    }
}
