package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou que for passado
    // 3 - bloco de inicialização é executado
    // 4 - construtor é executado

    // Instância -> bloco de inicialização
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {
        for(int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
