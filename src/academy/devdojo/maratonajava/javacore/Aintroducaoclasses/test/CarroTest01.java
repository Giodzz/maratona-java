package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Honda Civic";
        carro01.modelo = "Sport";
        carro01.ano = 2020;

        System.out.printf("O melhor de todos %s %s %d\n", carro01.nome, carro01.modelo, carro01.ano );
    }
}
