package introducao_orientacao_objetos.exercicios.vetores.ex08_abaixoMedia;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos tem o vetor? ");
        int quantNumeros = sc.nextInt();

        double[] arr1 = new double[quantNumeros];
        double somaArr = 0.0;

        for(int i = 0; i < quantNumeros; i++){
            System.out.print("Digite um numero: ");
            double numDigitado = sc.nextDouble();
            arr1[i] = numDigitado;
            somaArr += numDigitado;
        }

        double mediaVetor = somaArr/quantNumeros;

        System.out.printf("Media do vetor = %.3f%n", mediaVetor);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");

        for(double num : arr1){
            if(num > 0){
                if(num < mediaVetor){
                    System.out.println(num);
                }
            }
        }

    }
}
