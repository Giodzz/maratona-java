package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(3, 4);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(3, 2));
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
