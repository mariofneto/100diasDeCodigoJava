package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        double raio, area, pi = 3.14159;

        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
