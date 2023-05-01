package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3]; // declaração do array
        int[] numeros2 = {1, 2, 3, 4, 5}; // declarando e iniciando
        int[] numeros3 = new int[] {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println((numeros2[i]));
        }

        // for each
        for (int i: numeros3){
            System.out.println(i);
        }
    }
}
