package introducao_java.exercicios_estruturas_condicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valor = 0.00;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1) //cachorro quente
            valor = quantidade * 4.00;
        if(codigo == 2) // x-salada
            valor = quantidade * 4.50;
        if(codigo == 3) // x-bacon
            valor = quantidade * 5.00;
        if(codigo == 4) // torrada simples
            valor = quantidade * 2.00;
        if(codigo == 5) // refrigerante
            valor = quantidade * 1.50;

        System.out.printf("Total: R$ %.2f", valor);
    }
}
