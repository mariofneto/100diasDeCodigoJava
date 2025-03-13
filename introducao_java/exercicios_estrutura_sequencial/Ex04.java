package introducao_java.exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorPorHora, salary;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        salary = horasTrabalhadas * valorPorHora;

        System.out.println("Number = " + numeroFuncionario);
        System.out.printf("Salary = U$ %.2f", salary);

        sc.close();
    }
}
