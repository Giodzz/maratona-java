package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Mestre Kami";
        prof.sexo = 'M';
        prof.idade = 140;

        System.out.printf("Nome: %s, Idade: %d, Sexo: %c%n", prof.nome, prof.idade, prof.sexo);
    }
}
