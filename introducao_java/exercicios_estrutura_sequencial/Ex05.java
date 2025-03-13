package introducao_java.exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int cod1, cod2, numPeca1, numPeca2;
        double valorUnit1, valorUnit2;

        cod1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorUnit1 = sc.nextDouble();

        cod2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorUnit2 = sc.nextDouble();

        double valorAPagar = numPeca1 * valorUnit1 + numPeca2 * valorUnit2;

        System.out.printf("Valor a pagar: R$%.2f", valorAPagar);



        sc.close();
    }
}
