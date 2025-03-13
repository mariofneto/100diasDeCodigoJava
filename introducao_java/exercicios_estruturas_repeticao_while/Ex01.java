package introducao_java.exercicios_estruturas_repeticao_while;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Fórmula:  F = 9C / 5 + 32
        Scanner sc = new Scanner(System.in);
        char resposta;

        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9) / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n" , f);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
            System.out.println();
        }while(resposta != 'n');

        sc.close();

    }
}
