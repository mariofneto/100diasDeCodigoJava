package introducao_orientacao_objetos.exercicios.ex03_aluno;

import java.util.Locale;
import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3= sc.nextDouble();

        Aluno a1 = new Aluno(name, nota1, nota2, nota3);
        a1.pass();
    }
}
