package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Honda Civic";
        carro01.modelo = "Sport";
        carro01.ano = 2020;

        carro02.nome = "Mustang";
        carro02.modelo = "GT 500";
        carro02.ano = 1968;

        carro01 = carro02; // muda a referência

        System.out.printf("O melhor de todos %s %s %d\n", carro01.nome, carro01.modelo, carro01.ano );
        System.out.printf("O segundo melhor de todos %s %s %d\n", carro02.nome, carro02.modelo, carro02.ano );
    }
}
