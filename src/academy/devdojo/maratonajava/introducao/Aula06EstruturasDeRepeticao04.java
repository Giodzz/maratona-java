package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: valorParcela >= 1000

        double valorTotal = 30000;
        int parcela;
        double valorParcela;

        for (parcela = 1; parcela <= valorTotal; parcela++) {
            valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) continue;
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }

    }
}
