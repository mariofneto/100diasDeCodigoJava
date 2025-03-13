package introducao_java.exercicios_estruturas_condicionais;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0)
            System.out.println("MULTIPLOS");
        else
            System.out.println("NÃO MULTIPLOS");

        sc.close();
    }
}
