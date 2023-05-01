package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Padrão de inicialização:
        // byte, int, short, long, float e double: 0
        // char '\u0000'''
        // boolean false
        // Srting null

        int i;
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Giordana";
        nomes[2] = "Matheus";

        for(i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
