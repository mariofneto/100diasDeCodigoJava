package introducao_orientacao_objetos.exercicios.ex02_funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Funcionario f1 = new Funcionario(name, grossSalary, tax);

        f1.showResult();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        f1.increaseSalary(percentage);
    }
}
