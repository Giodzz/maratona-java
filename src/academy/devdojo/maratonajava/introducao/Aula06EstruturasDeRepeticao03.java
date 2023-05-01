package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor.
        // por ex, 50
        int i;
        int valorMax = 50;

        for (i = 0; i <= valorMax; i++) {
            if (i>25) break;
            System.out.println(i);
        }

        System.out.println("i = " + i);
    }
}
