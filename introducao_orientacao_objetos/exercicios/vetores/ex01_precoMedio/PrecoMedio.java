package introducao_orientacao_objetos.exercicios.vetores.ex01_precoMedio;

import java.util.Locale;
import java.util.Scanner;

public class PrecoMedio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produto[] produtos = new Produto[n];

        for(int i=0; i<n; i++){
            String nome = sc.nextLine();
            sc.nextLine();
            double preco = sc.nextDouble();


            Produto p = new Produto(nome,preco);
            produtos[i] = p;
        }

        double soma = 0.0;

        for(int i=0; i<n; i++){
            soma += produtos[i].getPreco();
        }

        double precoMedio = soma / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", precoMedio);
    }
}
