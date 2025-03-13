package introducao_java.exercicios_estruturas_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantRepet = sc.nextInt();

        for(int i = 0; i < quantRepet; i++){
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();

            double div = num1 / num2;

            if(num2 == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f%n", div);
            }
        }

    }
}
