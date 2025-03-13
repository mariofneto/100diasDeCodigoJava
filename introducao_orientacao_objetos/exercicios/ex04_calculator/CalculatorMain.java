package introducao_orientacao_objetos.exercicios.ex04_calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI value: %.2f%n", Math.PI);
    }
}
