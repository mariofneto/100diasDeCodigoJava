package introducao_orientacao_objetos.exercicios.vetores.ex06_maiorValor;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce quer digitar? ");
        int quantNumeros = sc.nextInt();

        double[] numeros = new double[quantNumeros];
        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        for(int i = 0; i < quantNumeros; i++){
            System.out.print("Digite um numero: ");
            double numeroDigitado = sc.nextDouble();
            numeros[i] = numeroDigitado;

            if(numeroDigitado > maiorValor){
                maiorValor = numeroDigitado;
                posicaoMaiorValor = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);

    }
}
