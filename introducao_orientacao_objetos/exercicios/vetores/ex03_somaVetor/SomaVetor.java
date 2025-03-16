package introducao_orientacao_objetos.exercicios.vetores.ex03_somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */

        System.out.print("Quantos numeros voce vai digitar? ");
        int numQuant = sc.nextInt();

        double[] numeros = new double[numQuant];

        for(int i = 0; i < numQuant; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            numeros[i] = num;
        }

        double soma = 0.0;
        double media = 0.0;

        System.out.print("VALORES = ");
        for(double numero : numeros){
            System.out.print(numero +" ");
            soma+=numero;
        }

        System.out.println("\n");


        media = soma / numQuant;

        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);
    }
}
