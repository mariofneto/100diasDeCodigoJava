package introducao;

import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String resposta = (a > 20) ? String.format("O número %d é maior que 20", a): String.format("O número %d é menor que 20", a);

        System.out.println(resposta);

        sc.close();
    }
}
