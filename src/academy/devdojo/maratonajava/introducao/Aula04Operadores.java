package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores básicos: + - * /
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // % -> operador de resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);

        // operadores relacionais: < > <= >= == != e retornam boolean
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);

        // operadores lógicos: &&(AND) ||(OR) !(NOT)
        int idade = 35;
        double salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        System.out.println(isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel" + isPlaystationCincoCompravel);

        // Operadores de atribuição: = += -= ++ *= /= %=
        double bonus = 1800;
        System.out.println(bonus);
        bonus += 1000;
        System.out.println(bonus);

        // incrementos: ++ --
        int contador = 0;
        contador++;
        ++contador;

        int contador02 = 0;
        System.out.println(contador02++);
        contador02--;
        System.out.println(++contador02);
    }
}
