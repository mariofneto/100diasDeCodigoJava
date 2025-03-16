package introducao_orientacao_objetos.exercicios.vetores.ex09_mediaPares;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos tem no vetor? ");
        int quantNumeros = sc.nextInt();

        int[] numeros = new int[quantNumeros];

        double somaNumerosPares = 0.0;
        int quantNumerosPares = 0;

        for(int i = 0; i < quantNumeros; i++){
            System.out.print("Digite um numero: ");
            int numDigitado = sc.nextInt();
            numeros[i] = numDigitado;

            if(numDigitado % 2 == 0) {
                somaNumerosPares += numeros[i];
                quantNumerosPares++;
            }
        }

        double mediaNumerosPares = somaNumerosPares/quantNumerosPares;

        if(somaNumerosPares > 0){
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaNumerosPares);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }


    }
}
