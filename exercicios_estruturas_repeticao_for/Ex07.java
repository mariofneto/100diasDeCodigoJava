package exercicios_estruturas_repeticao_for;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
          Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
          começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
          exemplo.
        */

        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            System.out.print(i+" ");
            System.out.print((int)Math.pow(i, 2)+" ");
            System.out.print((int)Math.pow(i, 3)+"\n");
        }

    }
}
