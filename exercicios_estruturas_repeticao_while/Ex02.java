package exercicios_estruturas_repeticao_while;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int soma = 0;
        while (num != 0){
            num = sc.nextInt();
            soma+=num;
        }
        System.out.println("A soma dos números digitados: " + soma);
    }
}
