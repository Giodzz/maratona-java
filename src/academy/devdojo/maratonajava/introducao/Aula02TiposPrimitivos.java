package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // 8 tipos primitivos: int, double, float, char, byte, short, long e boolean

        // conveção do nome das variáveis (camelcase)
        int idadeDeAlguem = (int) 10000000000L; // 4 bytes -> transformando long em int (cast)
        long numeroGrande = 1000000L; // 8 bytes
        double salarioDouble = 2000.0; // 8 bytes
        float salarioFloat = 2500.0F; // 4 bytes
        byte idadeByte = -128; // 1 byte de memória (-128 to 127)
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // não aceita 1 ou 0
        boolean falso = false;  // 1 bit
        int caracter = (int) 'A'; // 2 bytes (diferente de C)

        // String é um reference type, não é um tipo primitivo, é uma classe
        String nome = "um graande texto, não há limite";

        System.out.println("A idade é " + idadeDeAlguem); // concatenação
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(verdadeiro);
        System.out.println(caracter);
        System.out.println(nome);
    }
}
