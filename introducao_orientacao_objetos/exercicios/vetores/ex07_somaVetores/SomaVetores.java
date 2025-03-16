package introducao_orientacao_objetos.exercicios.vetores.ex07_somaVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantNumeros = sc.nextInt();

        int[]arrA = new int[quantNumeros];
        int[]arrB = new int[quantNumeros];
        int[]arrC = new int[quantNumeros];

        System.out.println("digite os valores do vetor A:");
        for(int i = 0; i < quantNumeros; i++){
            int valorDigitado = sc.nextInt();
            arrA[i] = valorDigitado;
        }

        System.out.println("digite os valores do vetor B:");
        for(int i = 0; i < quantNumeros; i++){
            int valorDigitado = sc.nextInt();
            arrB[i] = valorDigitado;
        }

        System.out.println("VALOR RESULTANTE");
        for(int i = 0; i < quantNumeros; i++){
            arrC[i] = arrA[i] + arrB[i];
            System.out.println(arrC[i]);
        }
    }
}
