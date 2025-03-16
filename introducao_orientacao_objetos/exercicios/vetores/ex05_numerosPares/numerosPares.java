package introducao_orientacao_objetos.exercicios.vetores.ex05_numerosPares;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce quer digitar? ");
        int numQuantidade = sc.nextInt();

        int[] numeros = new int[numQuantidade];

        for(int i = 0; i < numQuantidade; i++){
            System.out.print("Digite um numero: ");
            int numDigitado = sc.nextInt();
            numeros[i] = numDigitado;
        }

        System.out.println("NUMEROS PARES:");
        int contadorNumerosPares = 0;

        for(int numero : numeros){
            if(numero%2==0){
                System.out.print(numero+" ");
                contadorNumerosPares++;
            }
        }
        System.out.println("");
        System.out.println("QUANTIDADE DE PARES = " + contadorNumerosPares);

    }
}
