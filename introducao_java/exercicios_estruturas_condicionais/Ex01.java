package introducao_java.exercicios_estruturas_condicionais;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a < 0)
            System.out.println("NEGATIVO");
        else
            System.out.println("NÃO NEGATIVO");
    }
}
