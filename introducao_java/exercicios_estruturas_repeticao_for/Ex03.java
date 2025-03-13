package introducao_java.exercicios_estruturas_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        int quantRepet = sc.nextInt();
        double [] mediasPonderadas = new double[quantRepet];
        /*
            peso1 = 2
            peso2 = 3
            peso3 = 5
        */
        for(int i = 0; i < quantRepet; i++){
            double numeroMedia1 = sc.nextDouble();
            double numeroMedia2 = sc.nextDouble();
            double numeroMedia3 = sc.nextDouble();

            double mediaPonderada = (peso1 * numeroMedia1 + peso2 * numeroMedia2 + peso3 * numeroMedia3) /
                    (peso1 + peso2 + peso3);

            mediasPonderadas[i] = mediaPonderada;
        }

        for(double media : mediasPonderadas){
            System.out.printf("%.1f%n", media);
        }
    }
}
