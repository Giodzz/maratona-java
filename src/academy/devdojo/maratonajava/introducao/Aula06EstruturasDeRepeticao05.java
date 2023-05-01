package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        int parcela;
        double valorParcela;

        for (parcela = (int) valorTotal; parcela >= 1; parcela --){
            valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) continue;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
