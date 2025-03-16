package introducao_orientacao_objetos.exercicios.vetores.ex02_negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

         */

        System.out.print("Quantos números voce vai digitar? ");
        int quantNum = sc.nextInt();

        if(quantNum > 10){
            while(quantNum > 10){
                System.out.println("Passou do limite, tente uma quantidade menor");
                System.out.println("---------------------------");
                System.out.print("Quantos números voce vai digitar? ");
                quantNum = sc.nextInt();
            }
        }

        int[] numeros = new int[quantNum];
        int[] numerosNegativos = new int[quantNum];

        for(int i = 0; i < quantNum; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numeros[i] = num;

            if(num < 0){
                numerosNegativos[i] = num;
            }
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int numeronegativo : numerosNegativos){
            if(numeronegativo < 0) {
                System.out.println(numeronegativo);
            }
        }



    }
}
