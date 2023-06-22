package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
